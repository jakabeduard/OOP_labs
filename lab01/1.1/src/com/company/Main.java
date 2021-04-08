package com.company;

public class Main {

    public static void main(String[] args) {
         int age=18 ;
           for (String arg : args) {
               System.out.println(arg);
           }
        System.out.println("Jakab Eduard  " +age+ " years old");
        System.out.println(age);
        System.out.println();

        String nev = "Pentek Janos ";
        for (int i=0;i<nev.length();++i){
            System.out.println(nev.charAt(i));
        }
        printSomething();

        int number=6;
        int order=4;
        System.out.println("szam bitje egyenlo");
        System.out.println(getBit(number,order));
        pyramid(" almafa");

    }

    public static void printSomething(){
        System.out.println("valami");
    }

    public static double maxElement(double[] array){
        double max = Double.NEGATIVE_INFINITY;
        for (double v : array) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    /**
     *
     * @param number
     * @param order
     * @return
     */
    public static byte getBit(int number, int order){
        //13->1101; order=1 => 0
        //1101 >>2 => 00011
        //1101 <<2 => 110100
        //0011 &
        //0001
        //0001
        if (order<0||order>32){
            return -1;
        }
        return (byte) ((number>>order-1)&1);
    }


    public static void pyramid ( String nev){
         for (int i =0; i< nev.length();i ++){
              for ( int j =0 ;j< i+1 ; j++){
                  System.out.println( nev.charAt(j));
                 }
             System.out.println();
         }
         for (int i =0; i<nev.length();i++){
             System.out.println(nev.substring(0,i+1));
         }

    }

}


