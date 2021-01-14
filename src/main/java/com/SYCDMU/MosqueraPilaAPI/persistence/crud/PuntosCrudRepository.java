package com.SYCDMU.MosqueraPilaAPI.persistence.crud;

import com.SYCDMU.MosqueraPilaAPI.persistence.entity.puntosEntity;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

public interface PuntosCrudRepository extends CrudRepository<puntosEntity, BigInteger> {

    List<puntosEntity> findByIdRegistro(BigInteger idRegistro);

    List<puntosEntity> findByIdUsuario(String idUsuario);

    List<puntosEntity> findByIdLider(String idLider);

    List<puntosEntity> findByGrupo(String grupo);

    List<puntosEntity> findByFecha(Date fecha);
}
