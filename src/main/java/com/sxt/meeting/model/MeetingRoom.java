package com.sxt.meeting.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 会议室实体类
 *
 * @author songj
 * @date 2019/7/12 16:42
 */
@Setter
@Getter
@ToString
@Entity
@Table(name = "tbl_meeting_room")
public class MeetingRoom implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long roomId;

    @Column(name = "room_num")
    private int roomNum;

    @Column(name = "room_name")
    private String roomName;

    /**
     * 容量
     */
    @Column
    private int capacity;

    /**
     * 状态
     */
    @Column
    private int status;

    /**
     * 描述
     */
    @Column(length = 200)
    private String description;


}
