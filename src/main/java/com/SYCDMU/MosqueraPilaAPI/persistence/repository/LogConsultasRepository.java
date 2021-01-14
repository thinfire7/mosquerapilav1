package com.SYCDMU.MosqueraPilaAPI.persistence.repository;

import com.SYCDMU.MosqueraPilaAPI.persistence.crud.LogConsultasCrudRepository;
import com.SYCDMU.MosqueraPilaAPI.persistence.entity.logConsultasEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class LogConsultasRepository {

    @Autowired
    private LogConsultasCrudRepository logConsultasCrudRepository;

    public List<logConsultasEntity> getAll(){
        return (List<logConsultasEntity>) logConsultasCrudRepository.findAll();
    }

    public List<logConsultasEntity> getByIdConsulta(BigInteger idConsulta){
        return logConsultasCrudRepository.findByIdConsulta(idConsulta);
    }

    public List<logConsultasEntity> getByIdUsuario(String idUsuario){
        return logConsultasCrudRepository.findByIdUsuario(idUsuario);
    }

    public List<logConsultasEntity> getByFecConsulta(Date fecConsulta){
        return logConsultasCrudRepository.findByFecConsulta(fecConsulta);
    }
}
