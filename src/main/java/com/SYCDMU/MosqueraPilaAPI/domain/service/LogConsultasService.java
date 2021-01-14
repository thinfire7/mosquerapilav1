package com.SYCDMU.MosqueraPilaAPI.domain.service;

import com.SYCDMU.MosqueraPilaAPI.persistence.entity.logConsultasEntity;
import com.SYCDMU.MosqueraPilaAPI.persistence.repository.LogConsultasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

@Service
public class LogConsultasService {

    @Autowired public LogConsultasRepository logConsultasRepository;

    public List<logConsultasEntity> getAll(){
        return (List<logConsultasEntity>) logConsultasRepository.getAll();
    }

    public List<logConsultasEntity> getByIdConsulta(BigInteger idConsulta){
        return logConsultasRepository.getByIdConsulta(idConsulta);
    }

    public List<logConsultasEntity> getByIdUsuario(String idUsuario){
        return logConsultasRepository.getByIdUsuario(idUsuario);
    }

    public List<logConsultasEntity> getByFecConsulta(Date fecConsulta){
        return logConsultasRepository.getByFecConsulta(fecConsulta);
    }
}
