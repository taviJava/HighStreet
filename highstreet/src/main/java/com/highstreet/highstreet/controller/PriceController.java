package com.highstreet.highstreet.controller;

import com.highstreet.highstreet.persistance.dto.PriceDto;
import com.highstreet.highstreet.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PriceController {

    @Autowired
    private PriceService priceService;
    @PostMapping("/price")
    public void add(@RequestBody PriceDto priceDto){
        priceService.add(priceDto);
    }
    @DeleteMapping("/price/{id}")
    public void delete(@PathVariable(name = "id") long id){
        priceService.delete(id);
    }
    @GetMapping("/price")
    public List<PriceDto> getAll(){
        return priceService.getAll();
    }
    @GetMapping("/price/{id}")
    public PriceDto getOne(@PathVariable(name = "id") long id){
        return priceService.getById(id);
    }
}
