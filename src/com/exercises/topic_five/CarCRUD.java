package com.exercises.topic_five;

import java.util.List;

public interface CarCRUD {
    void save(Car car);

    void delete(Car car);

    List<Car> findAll();

}
