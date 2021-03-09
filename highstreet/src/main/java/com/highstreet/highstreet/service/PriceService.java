package com.highstreet.highstreet.service;

import com.highstreet.highstreet.persistance.dto.DistanceDto;
import com.highstreet.highstreet.persistance.dto.LocationDto;
import com.highstreet.highstreet.persistance.dto.PriceDto;
import com.highstreet.highstreet.persistance.model.*;
import com.highstreet.highstreet.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PriceService {
    @Autowired
    private PriceRepository priceRepository;

    public void add(PriceDto priceDto){
        priceRepository.save(getModel(priceDto));
    }

    public void delete(long id){
        priceRepository.deleteById(id);
    }

    public List<PriceDto> getAll(){
        List<Price> priceList = priceRepository.findAll();
        List<PriceDto> priceDtos = new ArrayList<>();
        for (Price price: priceList){
            priceDtos.add(getDto(price));
        }
        return priceDtos;
    }

    public PriceDto getById(long id){
        PriceDto priceDto = new PriceDto();
        Optional<Price> optionalPrice = priceRepository.findById(id);
        if (optionalPrice.isPresent()){
            priceDto = getDto(optionalPrice.get());
        }
        return priceDto;
    }
    private Price getModel(PriceDto priceDto){
        Price price = new Price();
        price.setId(priceDto.getId());
        price.setValue(priceDto.getValue());
        price.setVehicle(Vehicle.valueOf(priceDto.getVehicle()));
        Distance distance = new Distance();
        distance.setId(priceDto.getDistance().getId());
        price.setDistance(distance);
        return price;
    }

    private PriceDto getDto(Price price){
        PriceDto priceDto = new PriceDto();
        priceDto.setValue(price.getValue());
        priceDto.setId(price.getId());
        DistanceDto distanceDto = new DistanceDto();
        distanceDto.setKm(price.getDistance().getKm());
        Location startLocation = price.getDistance().getStartLocation();
        Location endLocation = price.getDistance().getEndLocation();
        LocationDto startLocationDto = new LocationDto();
        LocationDto endLocationDto = new LocationDto();
        startLocation.setName(startLocationDto.getName());
        endLocation.setName(endLocationDto.getName());
        distanceDto.setEndLocation(endLocationDto);
        distanceDto.setStartLocation(startLocationDto);
        priceDto.setDistance(distanceDto);
        return priceDto;
    }
}
