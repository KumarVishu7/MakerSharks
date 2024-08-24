package com.vishu.makersharks.controller;

import com.vishu.makersharks.model.SearchQuery;
import com.vishu.makersharks.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    @PostMapping("/api/supplier/query")
    public ResponseEntity<List<String>> query (@RequestBody SearchQuery searchQuery) {
        return ResponseEntity.ok(searchService.query(searchQuery));
    }

}
