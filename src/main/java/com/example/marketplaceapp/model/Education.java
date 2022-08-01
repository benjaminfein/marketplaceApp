package com.example.marketplaceapp.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Education {
    private String degreeName;
    private String institute;
    private Integer yearOfPassing;
}
