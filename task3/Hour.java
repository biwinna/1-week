package com.company.task3;

public class Hour {
    private final static int MAX_HOUR= 24;
    private int val;
    private Hour(int hour) throws Exception {
        if(hour >= 0 && hour <= MAX_HOUR)
            val = hour;
        else
            throw  new Exception("Hour range error!");
    }
    public static Hour of(int t) throws Exception {
        return new Hour(t);
    }

    boolean less(Hour hour){
        return this.val < hour.val;
    }
    boolean great(Hour hour){
        return this.val > hour.val;
    }
    boolean eq(Hour hour){
        return this.val == hour.val;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}
