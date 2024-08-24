package com.vishu.makersharks.service.impl;

import com.vishu.makersharks.exception.InvalidParameterException;
import com.vishu.makersharks.model.SearchCriteria;
import com.vishu.makersharks.model.SearchQuery;
import com.vishu.makersharks.repository.SearchRepository;
import com.vishu.makersharks.service.SearchService;
import com.vishu.makersharks.specification.SearchSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    private SearchRepository searchRepository;

    @Override
    public List<String> query(SearchQuery searchQuery) {
        validate(searchQuery);
        return searchRepository.findManufacturers(searchQuery.getLocation(),
                searchQuery.getBusinessNature(), searchQuery.getManufacturingProcess());
    }

    private void validate (SearchQuery searchQuery) {
        if (searchQuery.getLocation() == null || searchQuery.getLocation().isEmpty()) {
            throw new InvalidParameterException("Invalid Location");
        }
        if (searchQuery.getBusinessNature() == null) {
            throw new InvalidParameterException("Invalid Nature of Business");
        }
        if (searchQuery.getManufacturingProcess() == null) {
            throw new InvalidParameterException("Invalid Manufacturing Process");
        }
    }
}
