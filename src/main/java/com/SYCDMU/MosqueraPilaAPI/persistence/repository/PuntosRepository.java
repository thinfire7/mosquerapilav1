package com.SYCDMU.MosqueraPilaAPI.persistence.repository;

import com.SYCDMU.MosqueraPilaAPI.persistence.crud.PuntosCrudRepository;
import com.SYCDMU.MosqueraPilaAPI.persistence.entity.puntosEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class PuntosRepository {

    @Autowired
    private PuntosCrudRepository puntosCrudRepository;

    public List<puntosEntity> getAll(){
        return (List<puntosEntity>) puntosCrudRepository.findAll();
    }

    public List<puntosEntity> getByIdRegistro(BigInteger idRegistro){
        return puntosCrudRepository.findByIdRegistro(idRegistro);
    }

    public List<puntosEntity> getByIdUsuario(String idUsuario){
        return puntosCrudRepository.findByIdUsuario(idUsuario);
    }

    public List<puntosEntity> getByIdLider(String idLider){
        return puntosCrudRepository.findByIdLider(idLider);
    }

    public List<puntosEntity> getByGrupo(String grupo){
        return puntosCrudRepository.findByGrupo(grupo);
    }

    public List<puntosEntity> getByFecha(Date fecha){
        return puntosCrudRepository.findByFecha(fecha);
    }

    //crear un registro de puntos
    public puntosEntity save(puntosEntity puntos){
        System.out.println(puntos.toString());
        return puntosCrudRepository.save(puntos);
    }

    //eliminar un registro de puntos
    public void delete(BigInteger id){
        puntosCrudRepository.deleteById(id);
    }

}
