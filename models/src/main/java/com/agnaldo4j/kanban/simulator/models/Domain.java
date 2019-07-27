package com.agnaldo4j.kanban.simulator.models;

import com.agnaldo4j.kanban.simulator.models.commands.Event;
import io.reactivex.Observer;
import io.reactivex.subjects.PublishSubject;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

public class Domain<T> {
    private final String id;
    private final Date created;
    private final Optional<Date> updated;
    private final PublishSubject<Event<T>> publishSubject = PublishSubject.create();

    public Domain(Observer<Event<T>> observer) {
        this(UUID.randomUUID().toString(), new Date(), Optional.empty(), observer);
    }

    public Domain(String id, Observer<Event<T>> observer) {
        this(id, new Date(), Optional.empty(), observer);
    }

    public Domain(String id, Date created, Observer<Event<T>> observer) {
        this(id, created, Optional.empty(), observer);
    }

    public Domain(String id, Date created, Optional<Date> updated, Observer<Event<T>> observer) {
        this.id = id;
        this.created = created;
        this.updated = updated;
        this.publishSubject.subscribe(observer);
    }
}
