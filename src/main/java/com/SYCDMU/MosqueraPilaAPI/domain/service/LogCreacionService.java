package com.SYCDMU.MosqueraPilaAPI.domain.service;

import com.SYCDMU.MosqueraPilaAPI.persistence.entity.logCreacionEntity;
import com.SYCDMU.MosqueraPilaAPI.persistence.repository.LogCreacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

@Service
public class LogCreacionService {

    @Autowired
    public LogCreacionRepository logCreacionRepository;

    public List<logCreacionEntity> getAll(){
        return logCreacionRepository.getAll();
    }

    public List<logCreacionEntity> getByIdCreacion(BigInteger idCreacion) {
        return logCreacionRepository.getByIdCreacion(idCreacion);
    }

    public List<logCreacionEntity> getByFecCreacion(Date fecCreacion){
        return logCreacionRepository.getByFecCreacion(fecCreacion);
    }


}
