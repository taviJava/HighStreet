package com.highstreet.highstreet.persistance.model;

import javax.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double value;
    @OneToOne
    private Price price;
    @ManyToOne
    private Employee employee;
    @ManyToOne
    private TicketBooth ticketBooth;

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

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public TicketBooth getTicketBooth() {
        return ticketBooth;
    }

    public void setTicketBooth(TicketBooth ticketBooth) {
        this.ticketBooth = ticketBooth;
    }
}
