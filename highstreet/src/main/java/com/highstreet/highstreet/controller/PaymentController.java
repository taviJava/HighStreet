package com.highstreet.highstreet.controller;

import com.highstreet.highstreet.persistance.dto.PaymentDto;
import com.highstreet.highstreet.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    @PostMapping("/payment")
    public void add(@RequestBody PaymentDto paymentDto){
        paymentService.add(paymentDto);
    }
    @DeleteMapping("/payment/{id}")
    public void delete(@PathVariable(name = "id") long id){
        paymentService.delete(id);
    }
    @GetMapping("/payment")
    public List<PaymentDto> getAll(){
        return paymentService.getAll();
    }
    @GetMapping("/payment/{id}")
    public PaymentDto getOne(@PathVariable(name = "id") long id){
        return paymentService.getById(id);
    }
}
