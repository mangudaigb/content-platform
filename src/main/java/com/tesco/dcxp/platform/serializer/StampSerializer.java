package com.tesco.dcxp.platform.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.tesco.dcxp.platform.models.Stamp;

import java.io.IOException;

public class StampSerializer extends StdSerializer<Stamp> {

    public StampSerializer() {
        this(null);
    }

    public StampSerializer(Class<Stamp> s) {
        super(s);
    }

    @Override
    public void serialize(Stamp value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        gen.writeStringField("id", value.getUuid().toString());
        gen.writeStringField("text", value.getText().getText());
        gen.writeStringField("image", value.getImage().getImage());
        gen.writeEndObject();
    }
}
