package com.SYCDMU.MosqueraPilaAPI.persistence.crud;

import com.SYCDMU.MosqueraPilaAPI.persistence.entity.administradorEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AdministradorCrudRepository extends CrudRepository<administradorEntity,String>{

    //@Query(value = "SELECT * FROM administrador WHERE cedula = ?", nativeQuery = true )
    List<administradorEntity> findByCedula(String cedula);

    List<administradorEntity> findByNombres(String nombres);
}
