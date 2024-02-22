package com.sh.app.devs.service;

import com.sh.app.devs.repository.DevsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class DevsQueryService {
    private final DevsRepository devsRepository;

    public ResponseEntity<?> findById(Long id) {
        try {
            return ResponseEntity.ok(devsRepository.findById(id).get());
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
