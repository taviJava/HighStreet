package com.highstreet.highstreet.service;

import com.highstreet.highstreet.persistance.dto.*;
import com.highstreet.highstreet.persistance.model.*;
import com.highstreet.highstreet.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public void add(PaymentDto paymentDto){
        paymentRepository.save(getModel(paymentDto));
    }

    public void delete(long id){
        paymentRepository.deleteById(id);
    }

    public List<PaymentDto> getAll(){
        List<Payment> paymentList = paymentRepository.findAll();
        List<PaymentDto> paymentDtos = new ArrayList<>();
        for (Payment payment: paymentList){
            paymentDtos.add(getDto(payment));
        }
        return paymentDtos;
    }

    public PaymentDto getById(long id){
        PaymentDto paymentDto = new PaymentDto();
        Optional<Payment> optionalPayment = paymentRepository.findById(id);
        if (optionalPayment.isPresent()){
            paymentDto = getDto(optionalPayment.get());
        }
        return paymentDto;
    }

    private Payment getModel(PaymentDto paymentDto){
        Payment payment = new Payment();
        payment.setId(paymentDto.getId());
        payment.setValue(paymentDto.getValue());
        Employee employee =new Employee();
        employee.setId(paymentDto.getEmployee().getId());
        payment.setEmployee(employee);
        Price price = new Price();
        price.setId(paymentDto.getPrice().getId());
        payment.setPrice(price);
        TicketBooth ticketBooth = new TicketBooth();
        ticketBooth.setId(paymentDto.getTicketBooth().getId());
        payment.setTicketBooth(ticketBooth);
        return payment;
    }
    private PaymentDto getDto(Payment payment){
        PaymentDto paymentDto = new PaymentDto();
        paymentDto.setId(payment.getId());
        paymentDto.setValue(payment.getValue());
        EmployeeDto employeeDto =new EmployeeDto();
        employeeDto.setId(payment.getEmployee().getId());
        employeeDto.setName(payment.getEmployee().getName());
        paymentDto.setEmployee(employeeDto);
        PriceDto priceDto = new PriceDto();
        priceDto.setId(paymentDto.getPrice().getId());
        priceDto.setValue(payment.getValue());
        paymentDto.setPrice(priceDto);
        TicketBoothDto ticketBoothDto = new TicketBoothDto();
        ticketBoothDto.setId(paymentDto.getTicketBooth().getId());
        paymentDto.setTicketBooth(ticketBoothDto);
        return paymentDto;
    }
}
