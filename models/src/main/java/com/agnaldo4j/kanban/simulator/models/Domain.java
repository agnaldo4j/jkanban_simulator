package com.agnaldo4j.kanban.simulator.models;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class Domain<T> implements Serializable {
    private final String id;
    private final Date created;
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

    public String id() {
        return this.id;
    }
}
