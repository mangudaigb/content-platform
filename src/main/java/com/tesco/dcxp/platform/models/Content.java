package com.tesco.dcxp.platform.models;

import java.util.UUID;

public class Content {
    private UUID uuid = UUID.randomUUID();

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
