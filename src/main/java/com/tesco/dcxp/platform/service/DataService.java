package com.tesco.dcxp.platform.service;

import com.tesco.dcxp.platform.models.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
public class DataService {

    private Map<UUID, Content> contentStore = new HashMap<>();

    @PostConstruct
    public void initialize() {
        Text text1 = new Text("Item One");
        Text text2 = new Text("Item Two");
        Text text3 = new Text("Item Three");
        List<Text> textList = new ArrayList<>();
        textList.add(text1);
        textList.add(text2);
        textList.add(text3);

        Image image1 = new Image("Image One");
        Image image2 = new Image("Image Two");
        Image image3 = new Image("Image Three");
        List<Image> imageList = new ArrayList<>();
        imageList.add(image1);
        imageList.add(image2);
        imageList.add(image3);


        Carousal carousal = new Carousal(textList, imageList);
        contentStore.put(carousal.getUuid(), carousal);

        Text text01 = new Text("Stamp Item One");
        Image image01 = new Image("Stamp Item One");
        Stamp stamp = new Stamp(text01, image01);
        contentStore.put(stamp.getUuid(), stamp);
    }

    public void addContent(Content content) {
        contentStore.put(content.getUuid(), content);
    }

    public List<Content> getAllContent() {
        List<Content> contentList = new ArrayList<>(contentStore.values());
        return contentList;
    }

    public Content getById(UUID id) {
        return contentStore.get(id);
    }

    public Content getByIdAndType(UUID id, Class clazz) {
        return null;
    }

    public Content getByIdAndChannel(UUID id, String channel) {
        Content content = contentStore.get(id);
        if (content instanceof Carousal) {
            Carousal c = (Carousal) content;
            CarousalTrait ct = c.getTrait();
            if (channel.equalsIgnoreCase("MOBILE"))
                return ct.forMobile(c);
            if (channel.equalsIgnoreCase("WEB"))
                return ct.forWeb(c);
            if (channel.equalsIgnoreCase("JIBI"))
                return ct.forJibi(c);
        }
        return null;
    }

    public Content getByIdAndTypeAndChannel(UUID id, Class clazz, String channel) {
        return null;
    }
}
