package com.example.demo;


import java.util.Map;

public class TimeSeries {



    private Map timeStamp;


    public TimeSeries(){
    }

    public Map getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Map timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "TimeSeries{" +
                "timeStamp=" + timeStamp +
                '}';
    }
}
