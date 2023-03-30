package com.exercises.topic_four;

public class SmartWatch extends SmartDevice{

    String name;
    int numSensors;
    boolean hasHeartRate;
    boolean hasPedometer;

    public SmartWatch() {

    }

    public SmartWatch(String os, String chipset, int memory, int ram, double screenSize, String name, int numSensors, boolean hasHeartRate, boolean hasPedometer) {
        super(os, chipset, memory, ram, screenSize);
        this.name = name;
        this.numSensors = numSensors;
        this.hasHeartRate = hasHeartRate;
        this.hasPedometer = hasPedometer;
    }
}
