package com.company.task3;

public enum TimesOfDay {
    NIGHT("ночь"),
    MORNING("утро"),
    DAY("день"),
    EVENING("вечер");

    private String str;

    TimesOfDay(String str) {
        this.str = str;
    }

    public String getString(){
        return this.str;
    }
}
