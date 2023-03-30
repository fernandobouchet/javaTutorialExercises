package com.exercises.topic_four;

public class SmartPhone extends SmartDevice {

    String model;
    String osVersion;
    boolean hasCamera;

    public SmartPhone() {

    }

    public SmartPhone(String os, String chipset, int memory, int ram, double screenSize, String model, String osVersion, boolean hasCamera) {
        super(os, chipset, memory, ram, screenSize);
        this.model = model;
        this.osVersion = osVersion;
        this.hasCamera = hasCamera;
    }
}
