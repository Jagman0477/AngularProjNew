package com.health.testsRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.model.Tests;
import com.health.model.TestsOffered;

public interface TestsRepository extends JpaRepository<Tests, Long>{
	Tests findBytestsId(Long user_id);
}
