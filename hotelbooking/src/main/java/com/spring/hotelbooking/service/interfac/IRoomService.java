package com.spring.hotelbooking.service.interfac;

import com.spring.hotelbooking.dto.Response;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface IRoomService {

    Response addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice, String description);
    List<String> getAllRoomTypes();
    Response getAllRooms();
    Response deleteRoom();
    Response updateRoom(Long roomId, String roomType, BigDecimal roomPrice, MultipartFile photo);
    Response getRoomById(Long roomId);
    Response getAvailableRoomsByDateAndType(LocalDate checkInDate, LocalDate checkOutDate, String roomType);
    Response getAllAvailableRooms();
}
