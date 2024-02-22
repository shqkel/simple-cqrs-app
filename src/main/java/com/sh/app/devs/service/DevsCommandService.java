package com.sh.app.devs.service;

import com.sh.app.devs.dto.DevCreateDto;
import com.sh.app.devs.entity.Dev;
import com.sh.app.devs.repository.DevsRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.net.URI;

@Service
@Transactional
@RequiredArgsConstructor
public class DevsCommandService {
    private final DevsRepository devsRepository;
    private final ModelMapper modelMapper;


    public ResponseEntity<?> create(DevCreateDto devCreateDto) {
        Dev dev = devsRepository.save(modelMapper.map(devCreateDto, Dev.class));
        return ResponseEntity.created(URI.create("/devs/" + dev.getId())).build();
    }
}
