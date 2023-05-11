package com.ZoomCar.Repository;

import com.ZoomCar.module.Vechile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarBookRepository extends JpaRepository<Vechile,Long> {

    //public List<Vechile> findAllById(Long Id);
}
