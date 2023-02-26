package org.example.seminar1.cw1;

public class HomeJob0102 {
    public static void main(String[] args) {
        String[] arrStr = {"Папа", "Мама", "Я"};
        for (int i = 0; i < arrStr.length; i++) {
            System.out.print(arrStr[i] + ' ');
        }
        System.out.println();
        for (int i = arrStr.length - 1; i >= 0; i--) {
            System.out.print(arrStr[i] + ' ');
        }
    }

}
