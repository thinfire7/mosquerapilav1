package com.SYCDMU.MosqueraPilaAPI.persistence.crud;

import com.SYCDMU.MosqueraPilaAPI.persistence.entity.logConsultasEntity;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

public interface LogConsultasCrudRepository extends CrudRepository<logConsultasEntity, BigInteger>{

    List<logConsultasEntity> findByIdConsulta(BigInteger idConsulta);

    List<logConsultasEntity> findByIdUsuario(String idUsuario);

    List<logConsultasEntity> findByFecConsulta(Date fecConsulta);
}
