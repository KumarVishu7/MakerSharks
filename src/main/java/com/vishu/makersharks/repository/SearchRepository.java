package com.vishu.makersharks.repository;

import com.vishu.makersharks.model.ManufacturingProcess;
import com.vishu.makersharks.model.NatureOfBusiness;
import com.vishu.makersharks.model.SearchQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRepository extends JpaRepository<SearchQuery, Integer>, JpaSpecificationExecutor<SearchQuery> {

    @Query("select s.companyName from SearchQuery s where s.location = :location and s.businessNature = :businessNature" +
            " and s.manufacturingProcess = :manufacturingProcess")
    List<String> findManufacturers (@Param("location") String location,
                                    @Param("businessNature") NatureOfBusiness businessNature,
                                    @Param("manufacturingProcess") ManufacturingProcess manufacturingProcess);
}
