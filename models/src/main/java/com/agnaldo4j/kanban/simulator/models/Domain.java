package com.agnaldo4j.kanban.simulator.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Accessors(fluent = true)
public class Domain<T> implements Serializable {
    @Getter(AccessLevel.PUBLIC)
    private final String id;

    @Getter(AccessLevel.PUBLIC)
    private final Date created;

    @Getter(AccessLevel.PUBLIC)
    private final Date updated;

    public Domain() {
        this(UUID.randomUUID().toString(), new Date(), null);
    }

    public Domain(String id) {
        this(id, new Date(), null);
    }

    public Domain(String id, Date created) {
        this(id, created, null);
    }

    public Domain(String id, Date created, Date updated) {
        this.id = id;
        this.created = created;
        this.updated = updated;
    }
}
