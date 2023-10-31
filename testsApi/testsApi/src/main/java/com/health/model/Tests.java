package com.health.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="tests")
public class Tests implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="testName")
	private String testName;
	
	@Column(name="testPrice")
	private double testPrice;
	
	@Column(name="testNormalValue")
	private double testNormalValue;
	
	@Column(name="testUnits")
	private double testUnits;
}
