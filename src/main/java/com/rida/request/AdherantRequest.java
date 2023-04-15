package com.rida.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdherantRequest {
    private String name;
    private String adresse;
}
