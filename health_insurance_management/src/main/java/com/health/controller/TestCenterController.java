package com.health.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.model.TestCenter;
import com.health.testCenterRepository.TestCenterRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class TestCenterController {

	@Autowired
	TestCenterRepository testCenterRepository;

	@PostMapping("/testcenter")
	public String createNewCenter(@RequestBody TestCenter testCenter) {
		testCenterRepository.save(testCenter);
		return "TestCenter database";
	}

	@GetMapping("/testcenter")
	public ResponseEntity<List<TestCenter>> getAllCenters() {
		List<TestCenter> centerList = new ArrayList<>();
		testCenterRepository.findAll().forEach(centerList::add);
		return new ResponseEntity<List<TestCenter>>(centerList, HttpStatus.OK);
	}

	@GetMapping("/testcenter/{id}")
	public ResponseEntity<TestCenter> getCenterById(@PathVariable long id) {
		Optional<TestCenter> center = testCenterRepository.findById(id);
		if (center.isPresent()) {
			return new ResponseEntity<TestCenter>(center.get(), HttpStatus.FOUND);
		} else {
			return new ResponseEntity<TestCenter>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/testcenter/{id}")
	public String deleteCenterById(@PathVariable long id) {
		testCenterRepository.deleteById(id);
		return "TestCenter deleted Successfully";
	}
}