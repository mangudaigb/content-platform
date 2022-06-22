package com.tesco.dcxp.platform.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tesco.dcxp.platform.serializer.StampSerializer;

@JsonSerialize(using = StampSerializer.class)
public class Stamp extends Content {
    private StampTrait trait;
    private Text text;
    private Image image;

    public Stamp() {
        trait = new StampTrait();
    }

    public Stamp(Text text, Image image) {
        this.text = text;
        this.image = image;
        this.trait = new StampTrait();
    }

    public StampTrait getTrait() {
        return trait;
    }

    public void setTrait(StampTrait trait) {
        this.trait = trait;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
