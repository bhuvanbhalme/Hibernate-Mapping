package com.cglia.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.student.entity.StudentAddress;

@Repository
public interface StudentAddressRepository extends JpaRepository<StudentAddress, Integer>{

}
