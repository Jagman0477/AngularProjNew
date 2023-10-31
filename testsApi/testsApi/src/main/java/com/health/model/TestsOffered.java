package com.health.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@NoArgsConstructor
@Table(name="testsAvailable")
public class TestsOffered {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;

	@Column(name = "testId")
	private Long testId;
	
	@Column(name = "testCenterId")
    private Long testCenterId;

//	TestsOfferedFunc() {
//	
//	RestTemplate restTemplate;
//	restTemplate = new RestTemplate();
//	// testsOffered
//
//	List<Tests>testsOffered = new ArrayList<>();
//	
//	ResponseEntity<TestCenter> forEntity2 = restTemplate.getForEntity("http://localhost:8083/testcenter/{id}", TestCenter.class);
//	Tests[] body = forEntity.getBody();
//	for (Tests tests : body) {
//		testsOffered.add(tests.getTestName());
//	}
//
//}
	
}
