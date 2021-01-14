package com.SYCDMU.MosqueraPilaAPI.persistence.crud;

import com.SYCDMU.MosqueraPilaAPI.persistence.entity.usuarioEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioCrudRepository extends CrudRepository<usuarioEntity,String> {

    List<usuarioEntity> findByCedula(String cedula);

    List<usuarioEntity> findByGenero(String genero);

    List<usuarioEntity> findByUniversidad(String universidad);

    List<usuarioEntity> findByCorreo(String correo);

    List<usuarioEntity> findByEstadoBenef(boolean estadoBenef);

}
