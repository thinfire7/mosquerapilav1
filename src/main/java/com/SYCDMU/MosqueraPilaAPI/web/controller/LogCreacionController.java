package com.SYCDMU.MosqueraPilaAPI.web.controller;

import com.SYCDMU.MosqueraPilaAPI.domain.service.LogCreacionService;
import com.SYCDMU.MosqueraPilaAPI.persistence.entity.logCreacionEntity;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/logCreacion")
public class LogCreacionController {

    @Autowired
    private LogCreacionService logCreacionService;

    @GetMapping("/all")
    public List<logCreacionEntity> getAll(){
        return logCreacionService.getAll();
    }

    @GetMapping("/idCreacion/{id}")
    public ResponseEntity<List<logCreacionEntity>> getByIdCreacion(@PathVariable("id") BigInteger idCreacion) {
        return new ResponseEntity<>(logCreacionService.getByIdCreacion(idCreacion), HttpStatus.OK);
    }

    @GetMapping("/fecCreacion/{fecha}")
    public ResponseEntity<List<logCreacionEntity>> getByFecCreacion(@PathVariable("fecha") Date fecCreacion){
        return new ResponseEntity<>(logCreacionService.getByFecCreacion(fecCreacion), HttpStatus.OK);
    }
}
