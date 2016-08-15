package ru.kourilenko;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        byte a [] = {67};
//        String s = new String(a);
//        System.out.println(s);
//        a[0] = 74;
//        System.out.println(s);
//        System.out.println(a);
//        String d = "Calendar";
//        System.out.println(d.charAt(2));
//        System.out.println(d.getBytes()[0]);
//        System.out.println("аАа".equalsIgnoreCase("a"));

        

        String text = "Идея метода: шаг сортировки состоит в проходе снизу вверх по массиву.";

        String [] b= text.split(" ");
        StringUtil.bubbleSort(b);

        for (int i = 0; i< b.length; i++){
            System.out.println(b[i]);
        }



    }



}
