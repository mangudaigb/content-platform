package com.tesco.dcxp.platform.models;

import java.util.List;
import java.util.stream.Collectors;

public class CarousalTrait implements ChannelTrait<Carousal> {
    @Override
    public Carousal forMobile(Carousal carousal) {
        List<Text> textList = carousal.getTextList();
        List<Text> newTextList = textList.stream().map(x -> {
            x.setText("Mobile version: " + x.getText());
            return x;
            }).collect(Collectors.toList());
        carousal.setTextList(newTextList);
        return carousal;
    }

    @Override
    public Carousal forWeb(Carousal carousal) {
        List<Text> textList = carousal.getTextList();
        List<Text> newTextList = textList.stream().map(x -> {
            x.setText("Web version: " + x.getText());
            return x;
        }).collect(Collectors.toList());
        carousal.setTextList(newTextList);
        return carousal;
    }

    @Override
    public Carousal forJibi(Carousal carousal) {
        List<Text> textList = carousal.getTextList();
        List<Text> newTextList = textList.stream().map(x -> {
            x.setText("Jibi version: " + x.getText());
            return x;
        }).collect(Collectors.toList());
        carousal.setTextList(newTextList);
        return carousal;
    }
}
