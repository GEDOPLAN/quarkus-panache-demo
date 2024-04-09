package de.gedoplan.showcase.panache.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Participant extends PanacheEntityBase {
  @Id
  private Long id;
  private String name;
  @Enumerated(EnumType.STRING)
  private Level level;
}
