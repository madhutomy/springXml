package com.tutorial.repository;

import com.tutorial.model.Car;

import java.util.List;

public interface CarRepository {

    List<Car> findAll();
}
