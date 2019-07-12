package com.sxt.meeting.repository;

import com.sxt.meeting.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author songj
 * @date 2019/7/12 17:22
 */
public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
