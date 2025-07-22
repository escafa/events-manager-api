package dev.escafa.Events.domain.adress;


import dev.escafa.Events.domain.event.Event;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "adress")
public class Adress {


    @Id
    @GeneratedValue
    private UUID id;

    private String city;
    private String uf;

    @ManyToOne
    JoinColumn(name = "event_id")
        private Event event;



}
