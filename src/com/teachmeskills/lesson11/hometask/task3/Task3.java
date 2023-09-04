package com.teachmeskills.lesson11.hometask.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = 0;
        while (sc.hasNextInt()){
            capacity = sc.nextInt();
            if(capacity < 100 && capacity > 0){
                break;
            }
            System.out.println("Please, enter less number or bigger then zero.");
        }

        ArrayList<Integer> numbers = new ArrayList<>(capacity);
        for(int i = 0; i < capacity; i++) {
            numbers.add((int) (Math.random() * 10));
        }
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        System.out.println(numbers);
        System.out.println("Average value is : " + (double) sum/capacity);
    }
}
