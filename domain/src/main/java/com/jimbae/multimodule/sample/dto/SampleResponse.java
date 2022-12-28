package com.jimbae.multimodule.sample.dto;

import com.jimbae.multimodule.sample.domain.Sample;
import com.jimbae.multimodule.type.SampleType;

public class SampleResponse {

    private Long id;
    private String name;
    private SampleType type;

    public SampleResponse() {
    }

    public SampleResponse(Long id, String name, SampleType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public static SampleResponse from(Sample savedSample) {
        return new SampleResponse(savedSample.getId(), savedSample.getName(),
            savedSample.getType());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SampleType getType() {
        return type;
    }

    public void setType(SampleType type) {
        this.type = type;
    }
}
