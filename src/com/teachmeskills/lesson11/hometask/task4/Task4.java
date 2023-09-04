package com.teachmeskills.lesson11.hometask.task4;

import com.teachmeskills.lesson11.hometask.task4.model.Order;

import java.util.ArrayList;
import java.util.Comparator;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 750));
        orders.add(new Order(2, 240));
        orders.add(new Order(3, 360));
        orders.add(new Order(4, 1300));
        orders.add(new Order(5, 400));

        System.out.println("Orders: " + orders);
        orders.sort(Comparator.comparingInt(Order::getPrice));
        System.out.println("Sorted orders by price: " + orders);
    }
}
