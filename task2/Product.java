package com.company.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Product {

    private static int idGen = 0;
    private int id;
    private String name;
    private String upc;
    private String maker;
    private Double price;
    private LocalDate date;
    private int count;

    {
        id = idGen++;
    }

    public Product(String name, String upc, String maker, Double price, LocalDate date, int count) {
        this.name = name;
        this.upc = upc;
        this.maker = maker;
        this.price = price;
        this.date = date;
        this.count = count;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        LocalDate localDate = this.date;//For reference
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String dateStr = localDate.format(formatter);

        return String.format("ID: %d\t Наименование: %s\t Производитель: %s\t Цена %s \t Срок хранения: '%s'\t Количество %d",
                id, name, maker, price, dateStr, count);
    }
}
