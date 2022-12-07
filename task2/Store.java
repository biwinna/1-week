package com.company.task2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Store {
    List<Product> list;

    public Store() {
        list = new ArrayList<>();
    }
    public Store(List<Product> list) {
        this.list = list;
    }

    public void generateStore() {
        list.add(new Product("Сок яблочный", "6266198", "J7", 150.0, LocalDate.now().plus(300, ChronoUnit.DAYS), 7));
        list.add(new Product("Сок яблочный", "4537833", "Добрый", 90.0, LocalDate.now().plus(200, ChronoUnit.DAYS), 20));

        list.add(new Product("Шоколад", "9798727", "Щедрая Россия", 60.0, LocalDate.now().plus(365, ChronoUnit.DAYS), 10));
        list.add(new Product("Шоколад", "1235473", "Milka", 90.0, LocalDate.now().plus(365, ChronoUnit.DAYS), 20));

        list.add(new Product("Лимонад", "1231299", "Бочкари", 85.0, LocalDate.of(2023,10,20), 20));
    }



    public List<Product> getByName(String name) {
        return this.list.stream()
                .filter(product -> name.equals(product.getName()))
                .collect(Collectors.toList());
    }

    public List<Product> getByNameMaxPrice(String name, double price) {
        return this.list.stream()
                .filter(product ->
                        name.equals(product.getName())  && price > product.getPrice()
                )
                .collect(Collectors.toList());
    }

    public List<Product> getByBestBefore(LocalDate localDate) {
        return this.list.stream()
                .filter(product -> product.getDate().isAfter(localDate))
                .collect(Collectors.toList());
    }


}
