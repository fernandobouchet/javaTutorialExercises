package com.exercises.topic_four;

public class Main {
    public static void main(String[] args) {

        SmartWatch smartWatch1 = new SmartWatch("Tizen", "Exynos",6,512,0.5,"Samsung X2",8,true,false );

        System.out.println(smartWatch1.chipset);
        System.out.println(smartWatch1.name);

        SmartPhone smartPhone1 = new SmartPhone("Android","SnapDragon", 128,32,5,"Pixel 12", "13",true);

        System.out.println(smartPhone1.chipset);
        System.out.println(smartPhone1.osVersion);
    }
}
