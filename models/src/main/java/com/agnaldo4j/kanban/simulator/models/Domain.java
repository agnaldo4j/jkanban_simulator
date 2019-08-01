package com.agnaldo4j.kanban.simulator.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;

public class Domain<T> implements Serializable {
    private final String id;
    private final Date created;
    private final Optional<Date> updated;

    public Domain() {
        this(UUID.randomUUID().toString(), new Date(), Optional.empty());
    }

    public Domain(String id) {
        this(id, new Date(), Optional.empty());
    }

    public Domain(String id, Date created) {
        this(id, created, Optional.empty());
    }

    public Domain(String id, Date created, Optional<Date> updated) {
        this.id = id;
        this.created = created;
        this.updated = updated;
    }

    public String id() {
        return this.id;
    }
}
