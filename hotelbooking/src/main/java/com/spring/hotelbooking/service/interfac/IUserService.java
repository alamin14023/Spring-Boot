package com.spring.hotelbooking.service.interfac;

import com.spring.hotelbooking.dto.LoginRequest;
import com.spring.hotelbooking.dto.Response;
import com.spring.hotelbooking.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);
    Response getMyInfo(String email);
}
