package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    Optional<Department> findByDeptId(Integer deptId);

    Optional<List<Department>> findByDeptNameContaining(String deptName);

    Optional<Department> findByDeptName(String deptName);

}
