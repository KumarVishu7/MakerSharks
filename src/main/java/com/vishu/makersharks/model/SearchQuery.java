package com.vishu.makersharks.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Suppliers")
public class SearchQuery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int supplierId;
    String companyName;
    String website;
    String location;
    @Enumerated(EnumType.STRING)
    NatureOfBusiness businessNature;
    @Enumerated(EnumType.STRING)
    ManufacturingProcess manufacturingProcess;
}
