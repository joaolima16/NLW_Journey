package com.rocketseat.planner.trip.participant;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocketseat.planner.trip.Trip;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    public void registerParticipantsToEvent(List<String> participantsToInvite, Trip trip ) {

        List<Participant> participants = participantsToInvite.stream().map(email -> new Participant(email, trip)).toList();
        this.participantRepository.saveAll(participants);
    }

    public void triggerConfirmationEmailToParticipants(UUID tripId) {
    }
}
