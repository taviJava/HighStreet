package com.highstreet.highstreet.service;

import com.highstreet.highstreet.persistance.dto.TicketBoothDto;
import com.highstreet.highstreet.persistance.model.TicketBooth;
import com.highstreet.highstreet.repository.TicketBoothRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class TicketBoothService {
    @Autowired
    private TicketBoothRepository ticketBoothRepository;

    public void add(TicketBoothDto ticketBoothDto){
        ticketBoothRepository.save(getModel(ticketBoothDto));
    }

    public void delete(long id){
        ticketBoothRepository.deleteById(id);
    }

    public List<TicketBoothDto> getAll(){
        List<TicketBooth> ticketBooths = ticketBoothRepository.findAll();
        List<TicketBoothDto> ticketBoothDtos = new ArrayList<>();
        for (TicketBooth ticketBooth: ticketBooths){
            ticketBoothDtos.add(getDto(ticketBooth));
        }
        return ticketBoothDtos;
    }

    public TicketBoothDto getById(long id){
        TicketBoothDto ticketBoothDto = new TicketBoothDto();
        Optional<TicketBooth> optionalTicketBooth = ticketBoothRepository.findById(id);
        if (optionalTicketBooth.isPresent()){
            ticketBoothDto = getDto(optionalTicketBooth.get());
        }
        return ticketBoothDto;
    }

    private TicketBooth getModel(TicketBoothDto ticketBoothDto){
        TicketBooth ticketBooth = new TicketBooth();
        ticketBooth.setId(ticketBoothDto.getId());
        return ticketBooth;
    }

    private TicketBoothDto getDto(TicketBooth ticketBooth){
        TicketBoothDto ticketBoothDto = new TicketBoothDto();
        ticketBoothDto.setId(ticketBooth.getId());
        return ticketBoothDto;
    }
}
