package com.highstreet.highstreet.repository;

import com.highstreet.highstreet.persistance.model.Distance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistanceRepository extends JpaRepository<Distance,Long> {
}
