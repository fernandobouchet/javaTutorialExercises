package com.exercises.topic_five;

public class Main {
    static CarCRUD carCRUD = new CarCRUDImpl();

    public static void main(String[] args) {

        Car car1 = new Car("Ford","Focus",290, 5);
        Car car2 = new Car("Wolkswagen", "Gol", 310, 4);

        carCRUD.save(car1);
        System.out.println(carCRUD);
        carCRUD.save(car2);
        carCRUD.findAll();
        System.out.println(carCRUD);
        System.out.println(carCRUD.findAll());
        carCRUD.delete(car2);
        System.out.println(carCRUD);

    }
}
