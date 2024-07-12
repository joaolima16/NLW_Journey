package com.rocketseat.planner.participant;

import java.util.UUID;


import org.springframework.data.jpa.repository.JpaRepository;
import com.rocketseat.planner.trip.Trip;
import java.util.List;


public interface ParticipantRepository extends JpaRepository<Participant, UUID>{
    List<Participant> findByTripId(UUID tripId);
}
