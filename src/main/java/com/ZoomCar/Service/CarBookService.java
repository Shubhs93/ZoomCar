package com.ZoomCar.Service;

import com.ZoomCar.Repository.CarBookRepository;
import com.ZoomCar.module.Vechile;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CarBookService {
    private CarBookRepository carBookRepository;

    public CarBookService() {
        this.carBookRepository = carBookRepository;
    }

    public List<Vechile> findAllAvailableVechileInMyRegion(String city, LocalDate fromDate, LocalDate toDate){
        return null;
    }
}
