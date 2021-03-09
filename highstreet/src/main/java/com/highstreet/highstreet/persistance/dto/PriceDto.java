package com.highstreet.highstreet.persistance.dto;


public class PriceDto {
    private long id;
    private double value;
    private String vehicle;
    private DistanceDto distance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public DistanceDto getDistance() {
        return distance;
    }

    public void setDistance(DistanceDto distance) {
        this.distance = distance;
    }
}
