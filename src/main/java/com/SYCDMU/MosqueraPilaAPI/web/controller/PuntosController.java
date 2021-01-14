package com.SYCDMU.MosqueraPilaAPI.web.controller;

import com.SYCDMU.MosqueraPilaAPI.domain.service.PuntosService;
import com.SYCDMU.MosqueraPilaAPI.persistence.entity.puntosEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/puntos")
public class PuntosController {

    @Autowired
    private PuntosService puntosService;

    @GetMapping("/all")
    public ResponseEntity<List<puntosEntity>> getAll(){
        return new ResponseEntity<>(puntosService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/idRegistro/{id}")
    public ResponseEntity<List<puntosEntity>> getByIdRegistro(@PathVariable("id") BigInteger idRegistro){
        return new ResponseEntity<>(puntosService.getByIdRegistro(idRegistro), HttpStatus.OK);
    }

    @GetMapping("/idUsuario/{id}")
    public ResponseEntity<List<puntosEntity>> getByIdUsuario(@PathVariable("id") String idUsuario){
        return new ResponseEntity<>(puntosService.getByIdUsuario(idUsuario), HttpStatus.OK);
    }

    @GetMapping("/idLider/{id}")
    public ResponseEntity<List<puntosEntity>> getByIdLider(@PathVariable("id") String idLider){
        return new ResponseEntity<>(puntosService.getByIdLider(idLider), HttpStatus.OK);
    }

    @GetMapping("/grupo/{grupo}")
    public ResponseEntity<List<puntosEntity>> getByGrupo(@PathVariable("grupo") String grupo){
        return new ResponseEntity<>(puntosService.getByGrupo(grupo), HttpStatus.OK);
    }

    @GetMapping("/fecha/{fec}")
    public ResponseEntity<List<puntosEntity>> getByFecha(@PathVariable("fec") Date fecha){
        return new ResponseEntity<>(puntosService.getByFecha(fecha), HttpStatus.OK);
    }

    //crear un registro
    @PostMapping("/save")
    public ResponseEntity<puntosEntity> save(@RequestBody puntosEntity usuario){
        return new ResponseEntity<>(puntosService.save(usuario), HttpStatus.CREATED);
    }

    //eliminar un registro
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") BigInteger id){
        if(puntosService.delete(id)){
            return new ResponseEntity(HttpStatus.OK);
        }
        else
            return new ResponseEntity(HttpStatus.NOT_FOUND);

    }
}
