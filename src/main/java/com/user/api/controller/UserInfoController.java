package com.user.api.controller;

import com.user.api.model.UserInfoResponse;
import com.user.api.model.UserRequest;
import com.user.api.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserInfoController {

    private final UserInfoService userInfoService;

    @GetMapping
    public List<UserInfoResponse> getUsers(UserRequest userRequest){
        return userInfoService.getUsers(userRequest);
    }

}
