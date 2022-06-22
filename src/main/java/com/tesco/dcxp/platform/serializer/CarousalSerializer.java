package com.tesco.dcxp.platform.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.tesco.dcxp.platform.models.Carousal;
import com.tesco.dcxp.platform.models.Image;
import com.tesco.dcxp.platform.models.Text;

import java.io.IOException;
import java.util.List;

public class CarousalSerializer extends StdSerializer<Carousal> {
    public CarousalSerializer() {
        this(null);
    }

    public CarousalSerializer(Class<Carousal> c) {
        super(c);
    }

    @Override
    public void serialize(Carousal value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        gen.writeStringField("id", value.getUuid().toString());
        gen.writeArrayFieldStart("items");
        List<Text> textList = value.getTextList();
        List<Image> imageList = value.getImageList();
        for (int i = 0; i < textList.size(); i++) {
            gen.writeStartObject();
            gen.writeStringField("text", textList.get(i).getText());
            gen.writeStringField("image", imageList.get(i).getImage());
            gen.writeEndObject();
        }
        gen.writeEndArray();
        gen.writeEndObject();
    }
}
