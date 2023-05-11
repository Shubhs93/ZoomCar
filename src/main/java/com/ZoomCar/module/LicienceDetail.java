package com.ZoomCar.module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.Instant;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class LicienceDetail extends BaseModel {
    private long userId;
    private Instant DOI;
    private Instant ValidTill;
    private long issuedAddressId;
}
