package com.teachmeskills.lesson11.hometask.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Please, enter numbers. To cancel enter exit:");
        Scanner sc = new Scanner(System.in);
        do {
            if (sc.hasNextInt()) {
                numbers.add(sc.nextInt());
            }
        }
        while (!sc.nextLine().equals("exit"));
        numbers.removeIf(number -> number % 2 != 0);
        System.out.println(numbers);
    }
}
