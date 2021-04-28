package lab09_1;


import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        int year = 2021;
        int month, day;
        Random rand = new Random();
        ArrayList<MyDate> dateList = new ArrayList<MyDate>();
        MyDate[] dateArray = new MyDate[10];
        for (int i = 0; i < 10; i++) {
            month = rand.nextInt(12) + 1;
            day = rand.nextInt(32) + 1;
            if (DateUtil.isValidDate(year, month, day)) {
                MyDate datum = new MyDate(year, month, day);
                dateList.add(datum);
                dateArray[i] = datum;
                i++;
            }
        }


        System.out.println("Lista rendezes  elott ");
        for (MyDate a : dateList) {
            System.out.println();
        }
        System.out.println("Tomb rendezes  elott ");
        for (MyDate a : dateArray) {
            System.out.println();
        }

        //lista  rendezes
        Collections.sort(dateList);

        // tomb rendezes utan
        Arrays.sort(dateArray);


        System.out.println("Lista rendezes  elott ");
        for (MyDate a : dateList) {
            System.out.println();
        }
        System.out.println("Tomb rendezes  elott ");
        for (MyDate a : dateArray) {
            System.out.println();
        }

    }
}