package com.highstreet.highstreet.controller;

import com.highstreet.highstreet.persistance.dto.DistanceDto;
import com.highstreet.highstreet.service.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class DistanceController {
    @Autowired
    private DistanceService distanceService;
    @PostMapping("/distance")
    public void add(@RequestBody DistanceDto distanceDto){
        distanceService.add(distanceDto);
    }
    @DeleteMapping("/distance/{id}")
    public void delete(@PathVariable(name = "id") long id){
        distanceService.delete(id);
    }
    @GetMapping("/distance")
    public List<DistanceDto> getAll(){
        return distanceService.getAll();
    }
    @GetMapping("/distance/{id}")
    public DistanceDto getOne(@PathVariable(name = "id") long id){
        return distanceService.getById(id);
    }
}
