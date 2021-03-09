package com.highstreet.highstreet.repository;

import com.highstreet.highstreet.persistance.model.TicketBooth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketBoothRepository extends JpaRepository<TicketBooth, Long> {
}
