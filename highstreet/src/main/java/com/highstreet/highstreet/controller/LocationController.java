package com.highstreet.highstreet.controller;

import com.highstreet.highstreet.persistance.dto.LocationDto;
import com.highstreet.highstreet.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class LocationController {

    @Autowired
    private LocationService locationService;
    @PostMapping("/location")
    public void add(@RequestBody LocationDto locationDto){
        locationService.add(locationDto);
    }
    @DeleteMapping("/location/{id}")
    public void delete(@PathVariable(name = "id") long id){
        locationService.delete(id);
    }
    @GetMapping("/location")
    public List<LocationDto> getAll(){
        return locationService.getAll();
    }
    @GetMapping("/location/{id}")
    public LocationDto getOne(@PathVariable(name = "id") long id){
        return locationService.getById(id);
    }
}
