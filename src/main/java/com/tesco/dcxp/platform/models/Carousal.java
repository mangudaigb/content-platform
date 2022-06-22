package com.tesco.dcxp.platform.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tesco.dcxp.platform.serializer.CarousalSerializer;

import java.util.ArrayList;
import java.util.List;

@JsonSerialize(using = CarousalSerializer.class)
public class Carousal extends Content {
    private CarousalTrait trait;
    private List<Text> textList;
    private List<Image> imageList;

    public Carousal(final List<Text> textList, final List<Image> imageList) {
        trait = new CarousalTrait();
        this.textList = textList;
        this.imageList = imageList;
    }

    public CarousalTrait getTrait() {
        return trait;
    }

    public void setTrait(CarousalTrait trait) {
        this.trait = trait;
    }

    public List<Text> getTextList() {
        return textList;
    }

    public void setTextList(List<Text> textList) {
        this.textList = textList;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }
}
