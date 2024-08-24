package com.vishu.makersharks.service;

import com.vishu.makersharks.model.SearchQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SearchService {
    List<String> query(SearchQuery searchQuery);
}
