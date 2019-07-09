package com.tutorial.repository;

import com.tutorial.model.Car;

import java.util.ArrayList;
import java.util.List;

public class HibernateCarRepositoryImpl implements CarRepository {

    @Override
    public List<Car> findAll() {
        List<Car> carList = new ArrayList<>();
        Car car = new Car();
        car.setMake("TOYOTA");
        car.setModel("Camry");
        car.setTrim("LE");
        car.setYear(2019);
        carList.add(car);

        return carList;
    }
}
