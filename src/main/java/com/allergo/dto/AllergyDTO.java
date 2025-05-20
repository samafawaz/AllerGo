package com.allergo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AllergyDTO {
    private Long id;
    private String name;
    private String description;
    private String scientificName;
    private Integer severityLevel;
    private String commonFoodSources;
    private String symptoms;
    private String preventionTips;
    private Boolean isCommon;
    private String category;
    private String imageUrl;
    private String additionalInfo;

    // Constructor to convert from Allergy entity
    public AllergyDTO(com.allergo.model.Allergy allergy) {
        this.id = allergy.getId();
        this.name = allergy.getName();
        this.description = allergy.getDescription();
        this.scientificName = allergy.getScientificName();
        this.severityLevel = allergy.getSeverityLevel();
        this.commonFoodSources = allergy.getCommonFoodSources();
        this.symptoms = allergy.getSymptoms();
        this.preventionTips = allergy.getPreventionTips();
        this.isCommon = allergy.getIsCommon();
        this.category = allergy.getCategory();
        this.imageUrl = allergy.getImageUrl();
        this.additionalInfo = allergy.getAdditionalInfo();
    }

    // Static method to convert Allergy entity to DTO
    public static AllergyDTO fromEntity(com.allergo.model.Allergy allergy) {
        return new AllergyDTO(allergy);
    }

    // Static method to convert DTO to Allergy entity
    public static com.allergo.model.Allergy toEntity(AllergyDTO dto) {
        com.allergo.model.Allergy allergy = new com.allergo.model.Allergy();
        allergy.setId(dto.getId());
        allergy.setName(dto.getName());
        allergy.setDescription(dto.getDescription());
        allergy.setScientificName(dto.getScientificName());
        allergy.setSeverityLevel(dto.getSeverityLevel());
        allergy.setCommonFoodSources(dto.getCommonFoodSources());
        allergy.setSymptoms(dto.getSymptoms());
        allergy.setPreventionTips(dto.getPreventionTips());
        allergy.setIsCommon(dto.getIsCommon());
        allergy.setCategory(dto.getCategory());
        allergy.setImageUrl(dto.getImageUrl());
        allergy.setAdditionalInfo(dto.getAdditionalInfo());
        return allergy;
    }
}
