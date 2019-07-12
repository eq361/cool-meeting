package com.sxt.meeting.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 会议实体类
 *
 * @author songj
 * @date 2019/7/12 16:52
 */
@Setter
@Getter
@ToString
@Entity
@Table(name = "tbl_meeting")
public class Meeting implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meeting_id")
    private Long meetingId;

    @Column(name = "meeting_name")
    private String meetingName;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "number_of_participants")
    private int numberOfParticipants;

    @Column
    private int status;

    @Column(name = "canceled_time")
    private LocalDateTime canceledTime;

    @Column(name = "canceled_reason")
    private String canceledReason;

    @Column
    private String description;

    @ManyToOne
    private MeetingRoom meetingRoom;


    @OneToMany
    private List<Employee> employees;

    /**
     * 预订人
     */
    @ManyToOne
    private Employee reservationist;

    /**
     * 预订时间
     */
    @Column(name = "reservation_time")
    private LocalDateTime reservationTime;

}
