package com.highstreet.highstreet.persistance.dto;


public class TicketBoothDto {
    private long id;
    private LocationDto location;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocationDto getLocation() {
        return location;
    }

    public void setLocation(LocationDto location) {
        this.location = location;
    }
}
