package com.exercises.topic_five;

import java.util.ArrayList;
import java.util.List;

public class CarCRUDImpl implements CarCRUD{

    List<Car> cars = new ArrayList<Car>();

    @Override
    public void save(Car car) {
    cars.add(car);
    }

    @Override
    public void delete(Car car) {
    cars.remove(car);
    }

    @Override
    public List<Car> findAll() {
        return cars;
    }

}
