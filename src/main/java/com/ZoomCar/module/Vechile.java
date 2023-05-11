package com.ZoomCar.module;

import com.ZoomCar.Enum.SeaterType;
import com.ZoomCar.Enum.VechileStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Vechile extends BaseModel {

    @OneToOne
    private Address vechileAddress;
    private String vechileModel;
    private SeaterType seaterType;
    private VechileStatus vechileStatus;
    @OneToMany(mappedBy = "vechile")
    private List<VechileBookedTimeLine> vechileBookedTimeLines;
}
