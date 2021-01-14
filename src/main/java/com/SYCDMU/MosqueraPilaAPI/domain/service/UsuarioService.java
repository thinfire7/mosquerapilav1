package com.SYCDMU.MosqueraPilaAPI.domain.service;

import com.SYCDMU.MosqueraPilaAPI.persistence.entity.usuarioEntity;
import com.SYCDMU.MosqueraPilaAPI.persistence.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    public UsuarioRepository usuarioRepository;

    public List<usuarioEntity> getAll(){
        return usuarioRepository.getAll();
    }

    public List<usuarioEntity> getByCedula(String cedula){
        return usuarioRepository.getByCedula(cedula);
    }

    public List<usuarioEntity> getByGenero(String genero){
        return usuarioRepository.getByGenero(genero);
    }

    public List<usuarioEntity> getByUniversidad(String universidad){
        return usuarioRepository.getByUniversidad(universidad);
    }

    public List<usuarioEntity> getByCorreo(String correo){
        return usuarioRepository.getByCorreo(correo);
    }

    public List<usuarioEntity> getByEstadoBenef(boolean estado){
        return usuarioRepository.getByEstadoBenef(estado);
    }

    //crear un usuario
    public usuarioEntity save(usuarioEntity usuario){
        return usuarioRepository.save(usuario);
    }

    //eliminar un usuario
    public boolean delete(String cedula){
        if(!usuarioRepository.getByCedula(cedula).isEmpty()){
            usuarioRepository.delete(cedula);
            return true;
        }else{
            return false;
        }
    }


}
