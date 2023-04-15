package com.rida.controller;

import com.rida.dto.AdherantDTO;
import com.rida.request.AdherantRequest;
import com.rida.response.AdherantResponse;
import com.rida.service.AdherantService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/adherants")
public class AdherantController {
    @Autowired
    AdherantService service ;
    @PostMapping
    public AdherantResponse addAherant( @RequestBody AdherantRequest adherantRequest){
        AdherantResponse response = AdherantResponse.builder().build();
        AdherantDTO dto = AdherantDTO.builder().build();
        BeanUtils.copyProperties(adherantRequest,dto);
        AdherantDTO dto1 = service.addAdherant(dto);
        BeanUtils.copyProperties(dto1,response);
        return  response;
    }
    @GetMapping("/{id}")
    public AdherantResponse getAdherantById(@PathVariable Long id){
        AdherantDTO dto = service.getAdherantById(id);
        AdherantResponse response = AdherantResponse.builder().build();
        BeanUtils.copyProperties(dto,response);
        return  response;
    }
}
