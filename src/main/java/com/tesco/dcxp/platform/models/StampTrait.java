package com.tesco.dcxp.platform.models;

public class StampTrait implements ChannelTrait<Stamp>{

    @Override
    public Stamp forMobile(Stamp stamp) {
        Text text = stamp.getText();
        text.setText("Mobile version: " + text.getText());
        stamp.setText(text);
        return stamp;
    }

    @Override
    public Stamp forWeb(Stamp stamp) {
        Text text = stamp.getText();
        text.setText("Web version: " + text.getText());
        stamp.setText(text);
        return stamp;
    }

    @Override
    public Stamp forJibi(Stamp stamp) {
        Text text = stamp.getText();
        text.setText("Jibi version: " + text.getText());
        stamp.setText(text);
        return stamp;
    }
}
