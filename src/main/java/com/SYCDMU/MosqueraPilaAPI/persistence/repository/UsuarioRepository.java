package com.SYCDMU.MosqueraPilaAPI.persistence.repository;

import com.SYCDMU.MosqueraPilaAPI.persistence.crud.UsuarioCrudRepository;
import com.SYCDMU.MosqueraPilaAPI.persistence.entity.usuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepository {

    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;

    public List<usuarioEntity> getAll(){
        return (List<usuarioEntity>) usuarioCrudRepository.findAll();
    }

    public List<usuarioEntity> getByCedula(String cedula){
        return usuarioCrudRepository.findByCedula(cedula);
    }

    public List<usuarioEntity> getByGenero(String genero){
        return usuarioCrudRepository.findByGenero(genero);
    }

    public List<usuarioEntity> getByUniversidad(String universidad){
        return usuarioCrudRepository.findByUniversidad(universidad);
    }

    public List<usuarioEntity> getByCorreo(String correo){
        return usuarioCrudRepository.findByCorreo(correo);
    }

    public List<usuarioEntity> getByEstadoBenef(boolean estado){
        return usuarioCrudRepository.findByEstadoBenef(estado);
    }

    //crear un usuario
    public usuarioEntity save(usuarioEntity usuario){
        return usuarioCrudRepository.save(usuario);
    }

    //eliminar un usuario
    public void delete(String cedula){
        usuarioCrudRepository.deleteById(cedula);
    }

}
