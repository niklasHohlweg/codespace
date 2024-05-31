package org.example;

import java.io.Serializable;

public class InfectionTime implements Serializable {
    private String name;
    private String dotw;
    private String month;
    private int date;
    private int hour;
    private int minute;
    private int second;
    private int year;
    private String timezone;

    public InfectionTime(String[] virus, String[] zeit) {
        name = virus[0];
        dotw = virus[1];
        month = virus[2];
        date = Integer.parseInt(virus[3]);
        hour = Integer.parseInt(zeit[0]);
        minute = Integer.parseInt(zeit[1]);
        second = Integer.parseInt(zeit[2]);
        year = Integer.parseInt(virus[6]);
        timezone = virus[5];
    }
public String getMonth() {
    return month;
}

public void setMonth(String month) {
    this.month = month;
}

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getDotw() {
        return dotw;
    }

    public void setDotw(String dotw) {
        this.dotw = dotw;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public String toString() {
        return "InfectionTime{" +
                "name='" + name + '\'' +
                ", dotw='" + dotw + '\'' +
                ", month='" + month + '\'' +
                ", date='" + date + '\'' +
                ", hour='" + hour + '\'' +
                ", minute='" + minute + '\'' +
                ", second='" + second + '\'' +
                ", year='" + year + '\'' +
                ", timezone='" + timezone + '\''+
                '}';
    }
}