package com.highstreet.highstreet.persistance.dto;

import java.util.ArrayList;
import java.util.List;

public class LocationDto {

    private long id;
    private String name;
    private List<TicketBoothDto> ticketBooths = new ArrayList<>();
    private List<DistanceDto> distancesStart = new ArrayList<>();
    private List<DistanceDto> distancesEnd = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TicketBoothDto> getTicketBooths() {
        return ticketBooths;
    }

    public void setTicketBooths(List<TicketBoothDto> ticketBooths) {
        this.ticketBooths = ticketBooths;
    }

    public List<DistanceDto> getDistancesStart() {
        return distancesStart;
    }

    public void setDistancesStart(List<DistanceDto> distancesStart) {
        this.distancesStart = distancesStart;
    }

    public List<DistanceDto> getDistancesEnd() {
        return distancesEnd;
    }

    public void setDistancesEnd(List<DistanceDto> distancesEnd) {
        this.distancesEnd = distancesEnd;
    }
}
