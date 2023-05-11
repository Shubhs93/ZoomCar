package com.ZoomCar.module;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class VechileBookedTimeLine extends BaseModel{

    @ManyToOne
    @JoinColumn(name = "vechile_id")
    private Vechile vechile;
    private LocalDate from;
    private LocalDate to;



}
