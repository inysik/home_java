package org.example.seminar2.cw1;

import java.util.Arrays;

public class HomeJob0203 {
    public static void main(String[] args) {
        int mas[]={23,4,55,-3,-12};
        int sum =0;
        for (int i = 0; i < mas.length ; i++) {
            if (mas[i]>9) {
            sum = sum + mas[i];
            }

        }
        for (int i = 0; i < mas.length ; i++) {
            if (mas[i]<0){
                mas[i]=sum;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
