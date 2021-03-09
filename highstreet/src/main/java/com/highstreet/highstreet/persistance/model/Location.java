package com.highstreet.highstreet.persistance.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToMany(mappedBy = "location")
    private List<TicketBooth> ticketBooths = new ArrayList<>();
    @OneToMany(mappedBy = "startLocation")
    private List<Distance> distancesStart = new ArrayList<>();
    @OneToMany(mappedBy = "startLocation")
    private List<Distance> distancesEnd = new ArrayList<>();

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

    public List<TicketBooth> getTicketBooths() {
        return ticketBooths;
    }

    public void setTicketBooths(List<TicketBooth> ticketBooths) {
        this.ticketBooths = ticketBooths;
    }

    public List<Distance> getDistancesStart() {
        return distancesStart;
    }

    public void setDistancesStart(List<Distance> distancesStart) {
        this.distancesStart = distancesStart;
    }

    public List<Distance> getDistancesEnd() {
        return distancesEnd;
    }

    public void setDistancesEnd(List<Distance> distancesEnd) {
        this.distancesEnd = distancesEnd;
    }
}
