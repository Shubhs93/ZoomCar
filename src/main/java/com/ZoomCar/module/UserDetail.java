package com.ZoomCar.module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Entity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserDetail extends BaseModel{
    private String userName;
    private long userAddressId;
    private long userContactId;
}
