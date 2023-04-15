package com.rida.service;

import com.rida.dto.AdherantDTO;
import org.springframework.stereotype.Service;
public interface AdherantService {
    public AdherantDTO addAdherant(AdherantDTO ad);
    public  AdherantDTO getAdherantById(Long id);
}
