package com.exercises.topic_seven_eight_nine;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws Exception {
        //
        System.out.println(reverse("hola mundo"));
        // -1
        String[] arrayUnidimensional = {"HOLA", "MUNDO"};
        for(String elemento: arrayUnidimensional) {
            System.out.println(elemento);
        }
        // -2
        int[][] arrayBidimensional = {{1,100}, {2,200}, {3,300}, {40,400}};
        for(int i = 0; i < arrayBidimensional.length; i++ ) {
            for(int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.println("Posicion: " + i + "-" + j + " Valor:" + arrayBidimensional[i][j]);
            }
        }
        // -3

        Vector<String> vector = new Vector<>();
        vector.add("HOLA");
        vector.add("MUNDO");
        vector.add("LOREM");
        vector.add("IPSUM");
        vector.add("DOLOR");

        System.out.println(vector);

        vector.remove("MUNDO");
        vector.remove("LOREM");

        System.out.println(vector);

        // -4
         /*/
         El problema de utilizar un Vector con la capacidad por defecto teniendo que añadir 1000 elementos al mismo
         es que cada vez que el vector necesite más capacidad copia los datos en un array y vuelve a crear el vector,
         esto incurre en gastos de proceso y memoria, en este caso particular sería correcto indicar que la capacidad
         sea de 1000, y dependiendo del uso modificar su parámetro por defecto.
          */

        // -5
        ArrayList<String> arrayListString = new ArrayList<>();
        arrayListString.add("HOLA");
        arrayListString.add("MUNDO");
        arrayListString.add("LOREM");
        arrayListString.add("IPSUM");

        LinkedList<String> arrayLinkedList = new LinkedList<>(arrayListString);
        for(String elemento: arrayListString) {
            System.out.println(elemento);
        }
        for(String elemento: arrayLinkedList) {
            System.out.println(elemento);
        }

        // -6

        ArrayList<Integer> lista = new ArrayList<Integer>();

        for(int i = 1; i <= 10; i++) {
            lista.add(i);
        }
        System.out.println(lista);
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i) % 2 == 0) {
               lista.remove(i);
            }
        }
        System.out.println(lista);

        // -7

        dividePorCero(1,0);
        dividePorCero(2,3);

        // -8

        createCopy("/etc/passwd", "out.txt");


        // -9

        String fileIn = "/etc/passwd";
        String fileOut = "results.txt";

        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();
            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
            HashMap<Integer, String> map = new HashMap<>();
            map.put(0, fileOut);
            map.put(1, fileOut);
            map.put(2, fileOut);
            System.out.println(map);
            ArrayList<String> list = new ArrayList<>();
           for(int i = 0; i < map.size(); i++) {
               list.add(map.get(i));
           }
            System.out.println(list);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String reverse(String texto) {
        String reversedText = "";
        for(int i = texto.length() - 1; i != -1; i--) {
            reversedText += texto.charAt(i);
        }
        return reversedText;

    }

    public static void dividePorCero(float numero, float numero2) throws Exception {
        try {
          double result = numero / numero2;
            System.out.println(result);
        } catch (Exception ArithmeticException) {
            System.out.println("Esto no puede hacerse");
        }
        System.out.println("Demo de código");
    }

    public static void createCopy(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();
            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
