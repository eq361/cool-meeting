package com.sxt.meeting.repository;

import com.sxt.meeting.model.MeetingRoom;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author songj
 * @date 2019/7/12 17:26
 */
public interface MeetingRoomRepository extends JpaRepository<MeetingRoom,Long> {

}
