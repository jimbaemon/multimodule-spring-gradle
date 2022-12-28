package com.jimbae.multimodule.sample.ui;

import com.jimbae.multimodule.sample.application.SampleService;
import com.jimbae.multimodule.sample.dto.SampleRequest;
import com.jimbae.multimodule.sample.dto.SampleResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/samples")
public class SampleRestController {

    private final SampleService sampleService;

    public SampleRestController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @PostMapping
    public ResponseEntity<SampleResponse> createSample(@RequestBody SampleRequest request) {
        SampleResponse sampleResponse = sampleService.create(request);
        return ResponseEntity.ok(sampleResponse);
    }
}
