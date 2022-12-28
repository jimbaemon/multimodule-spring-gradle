package com.jimbae.multimodule.sample.domain;

import com.jimbae.multimodule.type.SampleType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sample {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private SampleType type;

    protected Sample() {
    }

    public Sample(String name, SampleType type) {
        this(null, name, type);
    }

    public Sample(Long id, String name, SampleType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public SampleType getType() {
        return type;
    }
}
