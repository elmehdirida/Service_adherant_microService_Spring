package com.rida.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdherantDTO {
    private Long id;
    private String name;
    private String adresse;
}
