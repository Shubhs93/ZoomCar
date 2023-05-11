package com.ZoomCar.controller;

import com.ZoomCar.Service.CarBookService;
import com.ZoomCar.module.Vechile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/book")
public class CarBookController {
    private CarBookService carBookService;

    public CarBookController(CarBookService carBookService) {
        this.carBookService = carBookService;
    }

    @GetMapping("/find-vechile/{city}/{fromDate}/{toDate}")
    public ResponseEntity<List<Vechile>> findAllVechileInMyRegion(@PathVariable String city, @PathVariable LocalDate fromDate ,@PathVariable LocalDate toDate){

        return null;
    }
}
