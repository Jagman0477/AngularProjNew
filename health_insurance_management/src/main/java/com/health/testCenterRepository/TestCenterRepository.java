package com.health.testCenterRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.model.TestCenter;

public interface TestCenterRepository extends JpaRepository<TestCenter, Long>{

	
}
