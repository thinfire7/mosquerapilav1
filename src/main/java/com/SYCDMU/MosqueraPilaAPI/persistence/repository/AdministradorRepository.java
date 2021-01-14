package com.SYCDMU.MosqueraPilaAPI.persistence.repository;

import com.SYCDMU.MosqueraPilaAPI.domain.Admin;
import com.SYCDMU.MosqueraPilaAPI.domain.repository.AdminRepository;
import com.SYCDMU.MosqueraPilaAPI.persistence.crud.AdministradorCrudRepository;
import com.SYCDMU.MosqueraPilaAPI.persistence.entity.administradorEntity;
import com.SYCDMU.MosqueraPilaAPI.persistence.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdministradorRepository implements AdminRepository {

    @Autowired
    private AdministradorCrudRepository administradorCrudRepository;

    @Autowired
    private AdminMapper mapper;

    @Override
    public List<Admin> getAll(){
        List<administradorEntity> administradores = (List<administradorEntity>) administradorCrudRepository.findAll();
        return mapper.toAdmins(administradores);
    }

    public List<Admin> getByCedula(String id){
         List<administradorEntity> administradorEntityList = administradorCrudRepository.findByCedula(id);
        return mapper.toAdmins(administradorEntityList);
    }

    public List<Admin> getByNombre(String name){
        List<administradorEntity> administradorEntityList = administradorCrudRepository.findByNombres(name);
        return mapper.toAdmins(administradorEntityList);
    }
}
