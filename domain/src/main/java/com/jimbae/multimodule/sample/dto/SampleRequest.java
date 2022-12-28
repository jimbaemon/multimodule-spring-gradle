package com.jimbae.multimodule.sample.dto;

import com.jimbae.multimodule.sample.domain.Sample;
import com.jimbae.multimodule.type.SampleType;

public class SampleRequest {

    private String name;
    private SampleType type;

    public SampleRequest() {
    }

    public SampleRequest(String name, SampleType type) {
        this.name = name;
        this.type = type;
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

    public Sample toSample() {
        return new Sample(name, type);
    }
}
