package com.SYCDMU.MosqueraPilaAPI.persistence.crud;

import com.SYCDMU.MosqueraPilaAPI.persistence.entity.liderEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
public interface LiderCrudRepository extends CrudRepository<liderEntity, String>{

    List <liderEntity> findByIdLider(String idLider);

    List<liderEntity> findByGrupo(String grupo);

}
