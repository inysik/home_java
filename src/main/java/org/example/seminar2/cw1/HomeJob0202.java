package org.example.seminar2.cw1;
import  java.util.Arrays;
public class HomeJob0202 {
    public static void main(String[] args) {
        int[] mas = new int[3];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20) + 10;
        }
        System.out.println(Arrays.toString(mas));

        boolean flag = true;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] <= mas[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("последовательность в массиве возрастающая");
        }else{
            System.out.println("последовательность вероятно убывающая или колебающаяся");
        }
    }
}
