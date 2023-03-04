package com.user.api.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class UserRequest {
    int pageNo;
    int id;
    int pageSize;
}
