package com.user.api.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class UserInfoResponse {
    int id;
    String name;
    String email;
    String phone;
}
