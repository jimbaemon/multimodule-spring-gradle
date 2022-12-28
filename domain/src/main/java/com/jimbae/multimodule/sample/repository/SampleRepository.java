package com.jimbae.multimodule.sample.repository;

import com.jimbae.multimodule.sample.domain.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<Sample, Long> {

}
