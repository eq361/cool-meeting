package com.sxt.meeting.repository;

import com.sxt.meeting.model.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author songj
 * @date 2019/7/12 17:25
 */
public interface MeetingRepository extends JpaRepository<Meeting,Long> {

}
