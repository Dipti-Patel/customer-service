package com.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.test.validation.DateValid;
import com.test.validation.GenderValid;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer_details")
public class CustomerDetailsModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@GenderValid
	@Column(name = "sex")
	private String sex;

	@DateValid
	@Column(name = "dob")
	private String dob;

	@Column(name = "natives")
	private String natives;
}
