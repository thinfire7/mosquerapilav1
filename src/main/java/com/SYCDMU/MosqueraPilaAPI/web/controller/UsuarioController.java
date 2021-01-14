package com.SYCDMU.MosqueraPilaAPI.web.controller;

import com.SYCDMU.MosqueraPilaAPI.domain.service.UsuarioService;
import com.SYCDMU.MosqueraPilaAPI.persistence.entity.usuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/all")
    public ResponseEntity<List<usuarioEntity>> getAll(){
        return new ResponseEntity<>(usuarioService.getAll(), HttpStatus.OK) ;
    }

    @GetMapping("/cedula/{cedula}")
    public ResponseEntity<List<usuarioEntity>> getByCedula(@PathVariable("cedula") String cedula){
        return new ResponseEntity<>(usuarioService.getByCedula(cedula), HttpStatus.OK);
    }

    @GetMapping("/genero/{genero}")
    public ResponseEntity<List<usuarioEntity>> getByGenero(@PathVariable("genero") String genero){
        return new ResponseEntity<>(usuarioService.getByGenero(genero), HttpStatus.OK);
    }

    @GetMapping("/universidad/{universidad}")
    public ResponseEntity<List<usuarioEntity>> getByUniversidad(@PathVariable("universidad") String universidad){
        return new ResponseEntity<>(usuarioService.getByUniversidad(universidad), HttpStatus.OK);
    }

    @GetMapping("/correo/{correo}")
    public ResponseEntity<List<usuarioEntity>> getByCorreo(@PathVariable("correo") String correo){
        return new ResponseEntity<>(usuarioService.getByCorreo(correo), HttpStatus.OK);
    }

    @GetMapping("/estado/{estado}")
    public ResponseEntity<List<usuarioEntity>> getByEstadoBenef(@PathVariable("estado") boolean estado){
        return new ResponseEntity<>(usuarioService.getByEstadoBenef(estado), HttpStatus.OK);
    }

    //crear un usuario
    @PostMapping("/save")
    public ResponseEntity<usuarioEntity> save(@RequestBody usuarioEntity usuario){
        return new ResponseEntity<>(usuarioService.save(usuario), HttpStatus.CREATED);
    }

    //eliminar un usuario
    @DeleteMapping("/delete/{cedula}")
    public ResponseEntity delete(@PathVariable("cedula") String cedula){
        if(usuarioService.delete(cedula)){
            return new ResponseEntity(HttpStatus.OK);
        }else
            return new ResponseEntity(HttpStatus.NOT_FOUND);

    }
}
