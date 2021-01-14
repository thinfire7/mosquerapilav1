package com.SYCDMU.MosqueraPilaAPI.web.controller;

import com.SYCDMU.MosqueraPilaAPI.domain.service.LiderService;
import com.SYCDMU.MosqueraPilaAPI.persistence.entity.liderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lider")
public class LiderController {

    @Autowired
    private LiderService liderService;

    @GetMapping("/all")
    public ResponseEntity<List<liderEntity>> getAll(){
        return new ResponseEntity<>(liderService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<List<liderEntity>> getByIdLider(@PathVariable("id") String idLider){
        return new ResponseEntity<>(liderService.getByIdLider(idLider), HttpStatus.OK);
    }

    @GetMapping("/grupo/{grupo}")
    public ResponseEntity<List<liderEntity>> getByGrupo(@PathVariable("grupo")String grupo){
        return new ResponseEntity<>(liderService.getByGrupo(grupo), HttpStatus.OK);
    }

    //crear un usuario
    @PostMapping("/save")
    public ResponseEntity<liderEntity> save(@RequestBody liderEntity lider){
        return new ResponseEntity<>(liderService.save(lider), HttpStatus.CREATED);
    }

    //eliminar un usuario
    @DeleteMapping("/delete/{cedula}")
    public ResponseEntity delete(@PathVariable("cedula") String cedula){
        if (liderService.delete(cedula)){
            return new ResponseEntity(HttpStatus.OK);
        }else
            return new ResponseEntity(HttpStatus.NOT_FOUND);
    }


}
