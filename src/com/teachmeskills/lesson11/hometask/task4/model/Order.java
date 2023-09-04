package com.teachmeskills.lesson11.hometask.task4.model;

public class Order {
    private long id;
    private int price;

    public Order(long id, int price) {
        this.id = id;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
