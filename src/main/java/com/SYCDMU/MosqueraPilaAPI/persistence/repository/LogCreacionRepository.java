package com.SYCDMU.MosqueraPilaAPI.persistence.repository;

import com.SYCDMU.MosqueraPilaAPI.persistence.crud.LogCreacionCrudRepository;
import com.SYCDMU.MosqueraPilaAPI.persistence.entity.logCreacionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class LogCreacionRepository {

    @Autowired
    private LogCreacionCrudRepository logCreacionCrudRepository;

    public List<logCreacionEntity> getAll(){
        return (List<logCreacionEntity>) logCreacionCrudRepository.findAll();
    }

    public List<logCreacionEntity> getByIdCreacion(BigInteger idCreacion){
        return logCreacionCrudRepository.findByIdCreacion(idCreacion);
    }

    public List<logCreacionEntity> getByFecCreacion(Date fecCreacion){
        return logCreacionCrudRepository.findByFecCreacion(fecCreacion);
    }

}
