package com.tesco.dcxp.platform.controller;

import com.tesco.dcxp.platform.models.Content;
import com.tesco.dcxp.platform.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class ContentController {

    @Autowired
    private DataService dataService;

    @GetMapping("/content")
    public List<Content> getAllContent() {
        return dataService.getAllContent();
    }

    @GetMapping("/content/{id}")
    public Content getContentById(@PathVariable String id) {
        return dataService.getById(UUID.fromString(id));
    }

    @GetMapping("/content/{id}/layer")
    public Content getContentByIdAndChannel(@PathVariable String id, @RequestParam String channel) {
        return dataService.getByIdAndChannel(UUID.fromString(id), channel);
    }

}
