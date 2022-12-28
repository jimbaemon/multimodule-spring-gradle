package com.jimbae.multimodule.sample.application;

import com.jimbae.multimodule.sample.domain.Sample;
import com.jimbae.multimodule.sample.dto.SampleRequest;
import com.jimbae.multimodule.sample.dto.SampleResponse;
import com.jimbae.multimodule.sample.repository.SampleRepository;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    private final SampleRepository sampleRepository;

    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public SampleResponse create(final SampleRequest request) {
        Sample sample = request.toSample();
        Sample savedSample = sampleRepository.save(sample);
        return SampleResponse.from(savedSample);
    }
}
