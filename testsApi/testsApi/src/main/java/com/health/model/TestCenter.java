package com.health.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "testCenter")
@Data
//@NoArgsConstructor
public class TestCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "centerName")
	private String centerName;

	@Column(name = "centerContact")
	private long centerContact;

	@Column(name = "centerAddress")
	private String centerAddress;

	@Column(name = "centerEmail")
	private String centerEmail;

	// @OneToMany(cascade = CascadeType.ALL)
	// @JoinColumn(name = "id", referencedColumnName = "id")
	// @Column(name="TestsOffered")
//	@Transient
//	private List<String> testsOffered;
	// = new ArrayList<>();

}
