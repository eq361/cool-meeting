package com.sxt.meeting.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 员工实体类
 *
 * @author songj
 * @date 2019/7/12 15:11
 */
@Setter
@Getter
@ToString
@Entity
@Table(name = "tbl_employee")
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(length = 15)
    private String username;

    @Column(length = 30)
    private String password;

    @Column(length = 11)
    private String phone;

    @Column(length = 30)
    private String email;
    /**
     * 状态
     */
    @Column
    private int status;

    /**
     * 角色
     */
    @Column
    private int role;

    /**
     * 部门
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    /**
     * 会议
     */
    @ManyToMany
    @JoinColumn(name = "meeting_id")
    private List<Meeting> meetings;


}
