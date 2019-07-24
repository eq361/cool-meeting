package com.sxt.meeting.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 部门实体类
 * @author songj
 * @date 2019/7/12 15:00
 */
@Setter
@Getter
@ToString
@Entity
@Table(name = "tbl_department")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 部门ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Long departmentId;

    /**
     * 部门名称
     */
    @Column(name = "department_name")
    private String departmentName;


    @OneToMany(mappedBy = "department",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<Employee> employees;
}
