package com.exercises.topic_three;

public class control_structures {
    public static void main(String[] args) {
        String[] names = {"Juan", "Fernando", "Lionel", "Enzo"};
        String allNames = "";

        for(int i = 0; i < names.length; i++) {
            allNames = allNames + names[i] + " ";
        }
        System.out.println(allNames);
    }
}
