package com.spring.hotelbooking.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.hotelbooking.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByRoomId(Long roomId);

    List<Booking> findByBookingConfirmationCode(String bookingConfirmationCode);

    List<Booking> findByUserId(Long userId);

}
