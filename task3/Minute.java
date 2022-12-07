package com.company.task3;

public class Minute {
    private final static int MAX_MINUTE = 60;
    private int val;
    private Minute(int minute) throws Exception {
        if(minute >= 0 && minute <= MAX_MINUTE)
            val = minute;
        else
            throw  new Exception("Minute range error!");
    }

    public static Minute of(int t) throws Exception {
        return new Minute(t);
    }
    @Override
    public String toString() {
        return String.valueOf(val);
    }

    boolean less(Minute minute){
        return this.val < minute.val;
    }
    boolean great(Minute minute){
        return this.val > minute.val;
    }
    boolean eq(Minute minute){
        return this.val == minute.val;
    }
}
