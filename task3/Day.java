package com.company.task3;

import java.time.LocalDate;
import java.time.LocalTime;

public class Day {

    private Hour hour;
    private Minute minute;

    private Day(Hour hour, Minute minute) {
        this.hour = hour;
        this.minute = minute;
    }
    private Day(int hour, int minute) {

    }

    static Day now() throws Exception {
        return new Day(Hour.of(LocalTime.now().getHour()), Minute.of(LocalTime.now().getMinute()));
    }

    static Day of(Hour hour, Minute minute){
        return new Day(hour, minute);
    }
    static Day of(int hour, int minute) throws Exception {
        return new Day(Hour.of(hour),Minute.of(minute));
    }

    String format(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.hour);
        stringBuilder.append(":");
        stringBuilder.append(this.minute);
        return stringBuilder.toString();
    }

    TimesOfDay getTimesOfDay(){
        try {
            if(this.hour.less(Hour.of(6))){
                return TimesOfDay.NIGHT;
            }else if(this.hour.less(Hour.of(12))){
                return TimesOfDay.MORNING;
            }else if(this.hour.less(Hour.of(18))){
                return TimesOfDay.DAY;
            }else {
                return TimesOfDay.EVENING;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Day{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }
}
