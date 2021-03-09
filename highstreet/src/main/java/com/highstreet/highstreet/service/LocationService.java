package com.highstreet.highstreet.service;

import com.highstreet.highstreet.persistance.dto.LocationDto;
import com.highstreet.highstreet.persistance.dto.TicketBoothDto;
import com.highstreet.highstreet.persistance.model.Location;
import com.highstreet.highstreet.persistance.model.TicketBooth;
import com.highstreet.highstreet.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public void add(LocationDto locationDto){
        locationRepository.save(getModel(locationDto));
    }

    public void delete(long id){
        locationRepository.deleteById(id);
    }

    public List<LocationDto> getAll(){
        List<Location> locationList = locationRepository.findAll();
        List<LocationDto> locationDtos = new ArrayList<>();
        for (Location location: locationList){
            locationDtos.add(getDto(location));
        }
        return locationDtos;
    }

    public LocationDto getById(long id){
        LocationDto locationDto = new LocationDto();
        Optional<Location> optionalLocation = locationRepository.findById(id);
        if (optionalLocation.isPresent()){
            locationDto = getDto(optionalLocation.get());
        }
        return locationDto;
    }

    private Location  getModel(LocationDto locationDto){
        Location location = new Location();
        location.setId(locationDto.getId());
        location.setName(locationDto.getName());

        List<TicketBooth> ticketBooths = new ArrayList<>();
        for (TicketBoothDto ticketBoothDto: locationDto.getTicketBooths()){
            TicketBooth ticketBooth = new TicketBooth();
            ticketBooth.setId(ticketBoothDto.getId());
            ticketBooths.add(ticketBooth);
        }
        location.setTicketBooths(ticketBooths);
        return location;
    }

    private LocationDto getDto(Location location){
        LocationDto locationDto = new LocationDto();
        locationDto.setId(location.getId());
        locationDto.setName(location.getName());

        List<TicketBoothDto> ticketBoothsDto = new ArrayList<>();
        for (TicketBooth ticketBooth: location.getTicketBooths()){
            TicketBoothDto ticketBoothDto = new TicketBoothDto();
            ticketBooth.setId(ticketBoothDto.getId());
            ticketBoothsDto.add(ticketBoothDto);
        }
        locationDto.setTicketBooths(ticketBoothsDto);
        return locationDto;
    }
}
