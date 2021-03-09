package com.highstreet.highstreet.controller;

import com.highstreet.highstreet.persistance.dto.TicketBoothDto;
import com.highstreet.highstreet.service.TicketBoothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TicketBoothController {

    @Autowired
    private TicketBoothService ticketBoothService;
    @PostMapping("/ticketbooth")
    public void add(@RequestBody TicketBoothDto ticketBoothDto){
        ticketBoothService.add(ticketBoothDto);
    }
    @DeleteMapping("/ticketbooth/{id}")
    public void delete(@PathVariable(name = "id") long id){
        ticketBoothService.delete(id);
    }
    @GetMapping("/ticketbooth")
    public List<TicketBoothDto> getAll(){
        return ticketBoothService.getAll();
    }
    @GetMapping("/ticketbooth/{id}")
    public TicketBoothDto getOne(@PathVariable(name = "id") long id){
        return ticketBoothService.getById(id);
    }
}
