package com.tesco.dcxp.platform.models;

import java.util.UUID;

public class Text extends Content {
    private String text;
    private String path;
    private String links;
    private Class[] types;

    public Text() {}
    public Text(String s) {
        this.text = s;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public Class[] getTypes() {
        return types;
    }

    public void setTypes(Class[] types) {
        this.types = types;
    }
}
