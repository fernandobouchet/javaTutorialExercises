package com.exercises.topic_two;

public class Functions {
    public static void main(String[] args) {
        double price = getIva(100);
        System.out.println(price);
    }

    /**
     * Simple function to calculate IVA
     * @param price - Price to calculate IVA (21% in Argentina)
     * @return - Returns the IVA calculated with the price
     */
    static double getIva(int price) {
        return price * 1.21;
    }


}
