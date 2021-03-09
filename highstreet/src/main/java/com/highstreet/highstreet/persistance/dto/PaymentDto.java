package com.highstreet.highstreet.persistance.dto;


public class PaymentDto {
    private long id;
    private double value;
    private PriceDto price;
    private EmployeeDto employee;
    private TicketBoothDto ticketBooth;

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

    public PriceDto getPrice() {
        return price;
    }

    public void setPrice(PriceDto price) {
        this.price = price;
    }

    public EmployeeDto getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDto employee) {
        this.employee = employee;
    }

    public TicketBoothDto getTicketBooth() {
        return ticketBooth;
    }

    public void setTicketBooth(TicketBoothDto ticketBooth) {
        this.ticketBooth = ticketBooth;
    }
}
