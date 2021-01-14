package com.SYCDMU.MosqueraPilaAPI.web.controller;

import com.SYCDMU.MosqueraPilaAPI.domain.service.LogConsultasService;
import com.SYCDMU.MosqueraPilaAPI.persistence.entity.logConsultasEntity;
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
@RequestMapping("/logConsultas")
public class LogConsultasController {

    @Autowired
    private LogConsultasService logConsultasService;

    @GetMapping("/all")
    public ResponseEntity<List<logConsultasEntity>> getAll(){
        return new ResponseEntity<>(logConsultasService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/idConsulta/{id}")
    public ResponseEntity<List<logConsultasEntity>> getByIdConsulta(@PathVariable("id") BigInteger idConsulta){
        return new ResponseEntity<>(logConsultasService.getByIdConsulta(idConsulta), HttpStatus.OK);
    }

    @GetMapping("/idUsuario/{id}")
    public ResponseEntity<List<logConsultasEntity>> getByIdUsuario(@PathVariable("id") String idUsuario){
        return new ResponseEntity<>(logConsultasService.getByIdUsuario(idUsuario), HttpStatus.OK);
    }

    @GetMapping("/fecha/{fec}")
    public ResponseEntity<List<logConsultasEntity>> getByFecConsulta(@PathVariable("fec") Date fecConsulta){
        return new ResponseEntity<>(logConsultasService.getByFecConsulta(fecConsulta), HttpStatus.OK);
    }



}
