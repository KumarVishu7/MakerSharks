package com.vishu.makersharks.specification;

import com.vishu.makersharks.model.Operation;
import com.vishu.makersharks.model.SearchCriteria;
import com.vishu.makersharks.model.SearchQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class SearchSpecification implements Specification<SearchQuery> {
    private SearchCriteria criteria;
    @Override
    public Predicate toPredicate(Root<SearchQuery> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        if (criteria.getOperation().equals(Operation.GREATER_THAN_OR_EQUAL)) {
            return criteriaBuilder.greaterThanOrEqualTo(
                    root.get(criteria.getKey()), criteria.getValue()
            );
        } else if (criteria.getOperation().equals(Operation.LESS_THAN_OR_EQUAL)) {
            return criteriaBuilder.lessThanOrEqualTo(
                    root.get(criteria.getKey()), criteria.getValue()
            );
        } else if (criteria.getOperation().equals(Operation.EQUAL)) {
            return criteriaBuilder.equal(
                    root.get(criteria.getKey()), criteria.getValue()
            );
        }
        return null;
    }
}
