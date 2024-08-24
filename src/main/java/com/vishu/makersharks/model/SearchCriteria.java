package com.vishu.makersharks.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SearchCriteria {
    private String key;
    private Operation operation;
    private String value;
}
