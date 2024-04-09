package de.gedoplan.showcase.panache.repository;

import de.gedoplan.showcase.panache.model.Participant;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ParticipantRepository implements PanacheRepository<Participant> {
}
