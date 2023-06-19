package com.test.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.test.validation.ContractTypeValid;
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
@Table(name = "customer")
public class CustomerModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "details")
	private CustomerDetailsModel details;

	@Column(name = "accountType")
	private String accountType;

	@OneToMany(targetEntity = BusinessRequirementsModel.class, mappedBy = "customerId", fetch = FetchType.EAGER)
	private List<String> businessRequirements;

	@ContractTypeValid
	@Column(name = "contractType")
	private String contractType;

}
