package com.company.task2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Store store = new Store();
        store.generateStore();

        // список товаров для заданного наименования
        String name = "Шоколад";
        System.out.println("список товаров для заданного наименования ('" +name +"')");
        List<Product> shokolad = store.getByName(name);
        shokolad.forEach(System.out::println);
        System.out.println();

        //список товаров для заданного наименования, цена которых не превосходит заданную;
        double price = 70.0;
        System.out.println("список товаров для заданного наименования('" + name + "'), цена которых не превосходит заданную('" + price + "');");
        List<Product> shokoladMaxPrice = store.getByNameMaxPrice(name, price);
        shokoladMaxPrice.forEach(System.out::println);
        System.out.println();

        // список товаров, срок хранения которых больше заданного.
        LocalDate date = LocalDate.now().plus(200, ChronoUnit.DAYS);
        System.out.println("список товаров, срок хранения которых больше заданного.");
        List<Product> byBestBefore = store.getByBestBefore(date);
        byBestBefore.forEach(System.out::println);
        System.out.println();
    }
}
