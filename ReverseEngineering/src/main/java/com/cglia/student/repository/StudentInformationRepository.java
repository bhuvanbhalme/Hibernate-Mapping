// StudentInformationRepository.java

package com.cglia.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.student.entity.StudentInformation;

@Repository
public interface StudentInformationRepository extends JpaRepository<StudentInformation, Integer> {

}
