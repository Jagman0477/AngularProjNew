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

import com.health.model.Tests;
import com.health.model.TestsOffered;
import com.health.testsRepository.TestsOfferedRepository;
import com.health.testsRepository.TestsRepository;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins="http://localhost:4200")

@RequestMapping("/")
public class TestsController {
	
	@Autowired
	TestsRepository testsRepository;
	
	@Autowired
	TestsOfferedRepository testsOfferedRepository;
	
	@PostMapping("/tests")
	public String addTests(@RequestBody Tests tests) {
		testsRepository.save(tests);
		return "test added";
	}
	
	@GetMapping("/allTests")
	public ResponseEntity<List<Tests>>getAllTests(){
		List<Tests> testList=new ArrayList<>();
		testsRepository.findAll().forEach(testList::add);
		return new ResponseEntity<List<Tests>>(testList,HttpStatus.OK);
	}
	
	@GetMapping("/tests")
	public ResponseEntity<List<Tests>>getTests(){
		List<Tests> testList=new ArrayList<>();
		testsRepository.findAll().forEach(testList::add);
		return new ResponseEntity<List<Tests>>(testList,HttpStatus.OK);
	}
	
//	@GetMapping("/tests/{id}")
//	public ResponseEntity<Tests>getTestById(@PathVariable long id){
//		Optional<Tests> test=testsRepository.findById(id);
//		if(test.isPresent()) {
//			return new ResponseEntity<Tests>(test.get(),HttpStatus.OK);
//		}
//		else {
//			return new ResponseEntity<Tests>(HttpStatus.NOT_FOUND);
//		}
//	}
//	
	@DeleteMapping("/tests/{id}")
	public String deleteTestById(@PathVariable long id) {
		testsRepository.deleteById(id);
		return "Test removed";
	}
	
	@GetMapping("/testcenteravailable/{centerId}")
	public ResponseEntity<List<Tests>> getAvailableCenters(@PathVariable long centerId) {
		List<Long> centerList = new ArrayList<>();
		List<Tests> testList = new ArrayList<>();
		testsOfferedRepository.findAllBytestCenterId(centerId).forEach(a -> centerList.add(a.getTestId()));
		centerList.forEach(a -> testList.add(testsRepository.findBytestsId(a)));
		return new ResponseEntity<List<Tests>>(testList, HttpStatus.OK);
	}
	
	@PostMapping("/testcenteravailable")
	public ResponseEntity<String> addAvailableCenters(@RequestBody TestsOffered testAvailable) {
		System.out.println(testAvailable);
		testsOfferedRepository.save(testAvailable);
		return  new ResponseEntity<>("test added",HttpStatus.OK);
	}
	
}
