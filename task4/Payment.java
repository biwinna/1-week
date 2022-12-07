package com.company.task4;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private String id;


    public Payment(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }






    public class Good{
        private String name;
        private int count;

        public Good(String name, int count) {
            this.name = name;
            this.count = count;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        @Override
        public String toString() {
            return "Payment(id#" + id + ") : " + "Good{" +
                    "name='" + name + '\'' +
                    ", count=" + count +
                    '}';
        }

        public void print() {
            System.out.println(this);
        }
    }
}
