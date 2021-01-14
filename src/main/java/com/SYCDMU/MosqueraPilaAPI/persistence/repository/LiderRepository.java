package com.SYCDMU.MosqueraPilaAPI.persistence.repository;

import com.SYCDMU.MosqueraPilaAPI.persistence.crud.LiderCrudRepository;
import com.SYCDMU.MosqueraPilaAPI.persistence.entity.liderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LiderRepository {

    @Autowired
    private LiderCrudRepository liderCrudRepository;

    public List<liderEntity> getAll(){
        return (List<liderEntity>) liderCrudRepository.findAll();
    }

    public List<liderEntity> getByIdLider(String idLider){
        return liderCrudRepository.findByIdLider(idLider);
    }

    public List<liderEntity> getByGrupo(String grupo){
        return liderCrudRepository.findByGrupo(grupo);
    }

    //crear un usuario
    public liderEntity save(liderEntity usuario){
        return liderCrudRepository.save(usuario);
    }

    //eliminar un usuario
    public void delete(String cedula){
        liderCrudRepository.deleteById(cedula);
    }
}
