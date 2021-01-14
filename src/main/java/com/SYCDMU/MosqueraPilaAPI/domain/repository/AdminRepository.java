package com.SYCDMU.MosqueraPilaAPI.domain.repository;

import com.SYCDMU.MosqueraPilaAPI.domain.Admin;

import java.util.List;
import java.util.Optional;

public interface AdminRepository {

    List<Admin> getAll();

    List<Admin> getByCedula(String id);

    List<Admin> getByNombre( String names);

}
