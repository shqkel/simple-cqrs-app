package com.sh.app.devs.controller;

import com.sh.app.devs.dto.DevCreateDto;
import com.sh.app.devs.service.DevsCommandService;
import com.sh.app.devs.service.DevsQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/devs")
public class DevsController {
    private final DevsCommandService devsCommandService;
    private final DevsQueryService devsQueryService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody DevCreateDto devCreateDto) {
        return devsCommandService.create(devCreateDto);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return devsQueryService.findById(id);
    }


}
