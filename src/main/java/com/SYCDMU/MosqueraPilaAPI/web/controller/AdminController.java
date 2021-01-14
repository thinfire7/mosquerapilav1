package com.SYCDMU.MosqueraPilaAPI.web.controller;

import com.SYCDMU.MosqueraPilaAPI.domain.Admin;
import com.SYCDMU.MosqueraPilaAPI.domain.service.AdminService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/all")
    @ApiOperation("Trae a todos los administradores del Programa")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<Admin>> getAll(){
        return new ResponseEntity<>(adminService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/cedula/{cedula}")
    @ApiOperation("Trae al administrador que coincida con la cedula dada")
    @ApiResponses({
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 404, message = "Administrador no encontrado")
    })
    public ResponseEntity<List<Admin>> getByCedula(@ApiParam(value = "cedula del administrador", required = true, example = "0000000000") @PathVariable("cedula") String id){
        if(!adminService.getByCedula(id).isEmpty()){
            return new ResponseEntity<>(adminService.getByCedula(id), HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(adminService.getByCedula(id), HttpStatus.NOT_FOUND);

    }

    @GetMapping("/names/{names}")
    public ResponseEntity<List<Admin>> getByNombre(@PathVariable("names") String names){
        if(!adminService.getByNombre(names).isEmpty()){
            return new ResponseEntity<>(adminService.getByNombre(names), HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(adminService.getByNombre(names), HttpStatus.NOT_FOUND); //para save usar .CREATED
    }

}
