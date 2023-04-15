package com.rida.dao;

import com.rida.model.Adherant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdherantDAO extends JpaRepository<Adherant,Long> {

}
