package com.highstreet.highstreet.service;

import com.highstreet.highstreet.persistance.dto.DistanceDto;
import com.highstreet.highstreet.persistance.dto.LocationDto;
import com.highstreet.highstreet.persistance.model.Distance;
import com.highstreet.highstreet.persistance.model.Location;
import com.highstreet.highstreet.repository.DistanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DistanceService {
    @Autowired
    private DistanceRepository distanceRepository;

    public void add(DistanceDto distanceDto){
        distanceRepository.save(getModel(distanceDto));
    }

    public void delete(long id){
        distanceRepository.deleteById(id);
    }

    public List<DistanceDto> getAll(){
        List<Distance> distanceList = distanceRepository.findAll();
        List<DistanceDto> distanceDtos = new ArrayList<>();
        for (Distance distance: distanceList){
            distanceDtos.add(getDto(distance));
        }
        return distanceDtos;
    }

    public DistanceDto getById(long id){
        DistanceDto distanceDto = new DistanceDto();
        Optional<Distance> optionalDistance = distanceRepository.findById(id);
        if (optionalDistance.isPresent()){
            distanceDto = getDto(optionalDistance.get());
        }
        return distanceDto;
    }

    private DistanceDto getDto(Distance distance){
        DistanceDto distanceDto = new DistanceDto();
        distanceDto.setId(distance.getId());
        distanceDto.setKm(distance.getKm());
        LocationDto startLocation = new LocationDto();
        startLocation.setName(distance.getStartLocation().getName());
        LocationDto endLocation = new LocationDto();
        endLocation.setName(distance.getEndLocation().getName());
        distanceDto.setStartLocation(startLocation);
        distanceDto.setEndLocation(endLocation);
        return distanceDto;
    }

    private Distance getModel(DistanceDto distanceDto){
        Distance distance = new Distance();
        distance.setKm(distanceDto.getKm());
        distance.setId(distanceDto.getId());
        Location startLocation = new Location();
        Location endLocation = new Location();
        startLocation.setId(distanceDto.getStartLocation().getId());
        endLocation.setId(distanceDto.getEndLocation().getId());
        distance.setStartLocation(startLocation);
        distance.setEndLocation(endLocation);
        return distance;
    }
}
