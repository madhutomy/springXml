package com.tutorial.service;

import com.tutorial.model.Car;
import com.tutorial.repository.CarRepository;

import java.util.List;

public class CarServiceImpl implements CarService {

    CarRepository carRepository;

    public CarServiceImpl (CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }
}
