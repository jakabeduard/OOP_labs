package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(creatMonogram( "Jakab Eduard"));



    }


    public  static String creatMonogram( String name){
        String[] tomb;
        tomb= name.split( " ");
        String monogram = "";
         for (String s : tomb){
             monogram+= s. charAt(0);

        }
    return monogram;

    }
}
