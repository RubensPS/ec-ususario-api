package com.letscode.ecuserapi.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserResponse {
    private Integer id;
    private String userName;
    private String name;
    private String email;
    private ZonedDateTime dateCreated;
    private ZonedDateTime dateUpdated;

    public UserResponse(UserEntity entity) {
        this.id = entity.getId();
        this.userName = entity.getUserName();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.dateCreated = entity.getDateCreated();
        this.dateUpdated = entity.getDateUpdated();
    }

}
