package com.SYCDMU.MosqueraPilaAPI.domain.service;

import com.SYCDMU.MosqueraPilaAPI.persistence.entity.liderEntity;
import com.SYCDMU.MosqueraPilaAPI.persistence.repository.LiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiderService {

    @Autowired
    public LiderRepository liderRepository;

    public List<liderEntity> getAll(){
        return liderRepository.getAll();
    }

    public List<liderEntity> getByIdLider(String idLider){
        return liderRepository.getByIdLider(idLider);
    }

    public List<liderEntity> getByGrupo(String grupo){
        return liderRepository.getByGrupo(grupo);
    }

    //crear un usuario
    public liderEntity save(liderEntity usuario){
        return liderRepository.save(usuario);
    }

    //eliminar un usuario
    public boolean delete(String cedula){
        if(!liderRepository.getByIdLider(cedula).isEmpty()){
            liderRepository.delete(cedula);
            return true;
        }else
            return false;

    }



}
