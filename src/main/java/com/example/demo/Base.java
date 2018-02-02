package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;


//@JsonIgnoreProperties(ignoreUnknown = true)
public class Base {

    @JsonProperty("Meta Data")
    private MetaData metaData;
    @JsonProperty("Time Series")
    private TimeSeries timeSeries;

    public Base(){
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData){
        this.metaData = metaData;
    }

    public TimeSeries getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(TimeSeries timeSeries){
        this.timeSeries = timeSeries;
    }

    @Override
    public String toString() {
        return "Base{" +
                "metaData=" + metaData +
                ", timeSeries=" + timeSeries +
                '}';
    }
}
