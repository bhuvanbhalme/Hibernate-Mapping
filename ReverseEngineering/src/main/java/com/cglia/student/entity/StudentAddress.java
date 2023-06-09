package com.cglia.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_address", catalog = "bhuvan")
public class StudentAddress implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id", unique = true, nullable = false)
	private Integer addressId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private StudentInformation studentInformation;

	@Column(name = "address_type", length = 45)
	private String addressType;

	@Column(name = "area", length = 45)
	private String area;

	@Column(name = "city", length = 45)
	private String city;

	@Column(name = "state", length = 45)
	private String state;

	public StudentAddress() {
	}

	public StudentAddress(StudentInformation studentInformation, String addressType, String area, String city,
			String state) {
		this.studentInformation = studentInformation;
		this.addressType = addressType;
		this.area = area;
		this.city = city;
		this.state = state;
	}

	// Getters and setters

	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public StudentInformation getStudentInformation() {
		return this.studentInformation;
	}

	public void setStudentInformation(StudentInformation studentInformation) {
		this.studentInformation = studentInformation;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
