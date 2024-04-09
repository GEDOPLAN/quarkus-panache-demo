package de.gedoplan.showcase.panache.rest;

import de.gedoplan.showcase.panache.model.Participant;
import de.gedoplan.showcase.panache.repository.ParticipantRepository;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;

public interface ParticipantResource extends PanacheRepositoryResource<ParticipantRepository, Participant, Long> {
}
