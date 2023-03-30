package com.exercises.topic_four;

public abstract class SmartDevice {
    String os;
    String chipset;
    int memory;
    int ram;
    double screenSize;

    public SmartDevice() {

    }

    public SmartDevice(String os, String chipset, int memory, int ram, double screenSize) {
        this.os = os;
        this.chipset = chipset;
        this.memory = memory;
        this.ram = ram;
        this.screenSize = screenSize;
    }
}
