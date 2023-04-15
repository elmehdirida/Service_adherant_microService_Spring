package com.rida.service;

import com.rida.dao.AdherantDAO;
import com.rida.dto.AdherantDTO;
import com.rida.model.Adherant;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdherantServiceImp implements AdherantService {
    @Autowired
    AdherantDAO dao ;
    @Override
    public AdherantDTO addAdherant(AdherantDTO ad) {
        AdherantDTO dto = AdherantDTO.builder().build();
        Adherant adr = new Adherant();
        BeanUtils.copyProperties(ad,adr);
        Adherant adr1 = dao.save(adr);
        BeanUtils.copyProperties(adr1,dto);
        return dto;
    }

    @Override
    public AdherantDTO getAdherantById(Long id) {
        AdherantDTO dto = AdherantDTO.builder().build();
        Adherant adr = dao.findById(id).get();
        BeanUtils.copyProperties(adr,dto);
        return dto;
    }
}
