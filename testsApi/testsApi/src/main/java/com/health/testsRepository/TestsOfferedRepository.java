package com.health.testsRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.model.TestsOffered;

public interface TestsOfferedRepository extends JpaRepository<TestsOffered, Long>{
	List<TestsOffered> findAllBytestCenterId(Long user_id);
}
