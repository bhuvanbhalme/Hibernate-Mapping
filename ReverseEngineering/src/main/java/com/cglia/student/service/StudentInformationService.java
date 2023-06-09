// StudentInformationService.java

package com.cglia.student.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cglia.student.entity.StudentAddress;
import com.cglia.student.entity.StudentInformation;
import com.cglia.student.repository.StudentAddressRepository;
import com.cglia.student.repository.StudentInformationRepository;

@Service
public class StudentInformationService {

	@Autowired
	private StudentInformationRepository informationRepository;

	@Autowired
	private StudentAddressRepository addressRepository;

	public StudentInformation saveStudentInformation(StudentInformation info) {
		for (StudentAddress address : info.getStudentAddresses()) {
			address.setStudentInformation(info);
			addressRepository.save(address);
		}
		return informationRepository.save(info);

	}

	public List<StudentInformation> getAllStudentInformation() {
		return informationRepository.findAll();
	}
}
