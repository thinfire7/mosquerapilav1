package com.SYCDMU.MosqueraPilaAPI.persistence.crud;

import com.SYCDMU.MosqueraPilaAPI.persistence.entity.logCreacionEntity;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

public interface LogCreacionCrudRepository extends CrudRepository<logCreacionEntity, BigInteger> {

    List<logCreacionEntity> findByIdCreacion(BigInteger idCreacion);

    List<logCreacionEntity> findByFecCreacion(Date fecCreacion);
}
