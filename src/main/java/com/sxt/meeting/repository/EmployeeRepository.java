package com.sxt.meeting.repository;

import com.sxt.meeting.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author songj
 * @date 2019/7/12 17:24
 */
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
