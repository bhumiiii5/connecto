package com.connecto.repository;

import com.connecto.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface StationRepository extends JpaRepository<Station, Long> {
    List<Station> findByAvailableTrue();
    Optional<Station> findByName(String name);
}

