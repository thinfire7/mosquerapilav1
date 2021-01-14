package com.SYCDMU.MosqueraPilaAPI.domain.repository;

import com.SYCDMU.MosqueraPilaAPI.domain.CreationLog;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

public interface CreationLogRepository {

    List<CreationLog> getAll();

    List<CreationLog> getByIdCreacion(BigInteger id);

    Optional<CreationLog> getByFecCreacion(Date creationDate);
}
