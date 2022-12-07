package com.company.task4;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment("6659214");
        Payment.Good good1 = payment.new Good("name1", 10);
        Payment.Good good2 = payment.new Good("name1", 10);
        Payment.Good good3 = payment.new Good("test", 5);

        good1.print();
        good2.print();
        good3.print();
    }
}
