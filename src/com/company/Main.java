package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число и только число");
        int i = 0; //контроль количества введенных
        do {
            System.out.println("Вводите число");
            if (scanner.hasNextInt()) {
                scanner.nextInt();
                i++;
                scanner.nextLine();
            } else {
                System.out.println("Это не число. Попробуйте еще раз");
                scanner.nextLine();
            }
        }while(i<3);
    }
}
