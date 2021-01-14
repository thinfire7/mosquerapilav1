package com.SYCDMU.MosqueraPilaAPI.domain.service;

import com.SYCDMU.MosqueraPilaAPI.persistence.entity.puntosEntity;
import com.SYCDMU.MosqueraPilaAPI.persistence.repository.PuntosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

@Service
public class PuntosService {

    @Autowired
    public PuntosRepository puntosRepository;

    public List<puntosEntity> getAll(){
        return (List<puntosEntity>) puntosRepository.getAll();
    }

    public List<puntosEntity> getByIdRegistro(BigInteger idRegistro){
        return puntosRepository.getByIdRegistro(idRegistro);
    }

    public List<puntosEntity> getByIdUsuario(String idUsuario){
        return puntosRepository.getByIdUsuario(idUsuario);
    }

    public List<puntosEntity> getByIdLider(String idLider){
        return puntosRepository.getByIdLider(idLider);
    }

    public List<puntosEntity> getByGrupo(String grupo){
        return puntosRepository.getByGrupo(grupo);
    }

    public List<puntosEntity> getByFecha(Date fecha){
        return puntosRepository.getByFecha(fecha);
    }

    //crear un registro
    public puntosEntity save(puntosEntity puntos){
        System.out.println(puntos.toString());
        return puntosRepository.save(puntos);
    }

    //eliminar un registro
    public boolean delete(BigInteger id) {
        if (!puntosRepository.getByIdRegistro(id).isEmpty()) {
            puntosRepository.delete(id);
            return true;
        } else {
            return false;
        }
    }



}
