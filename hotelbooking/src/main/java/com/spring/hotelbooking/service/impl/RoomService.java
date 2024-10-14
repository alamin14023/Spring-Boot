package com.spring.hotelbooking.service.impl;

import com.spring.hotelbooking.dto.Response;
import com.spring.hotelbooking.exception.OurException;
import com.spring.hotelbooking.repo.BookingRepository;
import com.spring.hotelbooking.repo.RoomRepository;
import com.spring.hotelbooking.service.interfac.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RoomService implements IRoomService {
    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private BookingRepository bookingRepository;
    @Override
    public Response addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice, String description) {
        Response response = new Response();
        try {

        }catch (OurException e){
            response.setMessage(e.getMessage());

        }catch (Exception e){
            response.setStatusCode(500);
            response.setMessage("Error saving a room "+ e.getMessage());
        }
        return null;
    }

    @Override
    public List<String> getAllRoomTypes() {
        return null;
    }

    @Override
    public Response getAllRooms() {
        return null;
    }

    @Override
    public Response deleteRoom() {
        return null;
    }

    @Override
    public Response updateRoom(Long roomId, String roomType, BigDecimal roomPrice, MultipartFile photo) {
        return null;
    }

    @Override
    public Response getRoomById(Long roomId) {
        return null;
    }

    @Override
    public Response getAvailableRoomsByDateAndType(LocalDate checkInDate, LocalDate checkOutDate, String roomType) {
        return null;
    }

    @Override
    public Response getAllAvailableRooms() {
        return null;
    }
}
