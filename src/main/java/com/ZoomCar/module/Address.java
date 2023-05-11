package com.ZoomCar.module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Address extends BaseModel{
    private int longitude;
    private int latitude;
    private int pincode;
    private String address;
    private String city;
    private String state;
    private String country;

}
