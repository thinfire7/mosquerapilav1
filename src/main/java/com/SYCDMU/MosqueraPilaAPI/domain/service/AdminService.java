package com.SYCDMU.MosqueraPilaAPI.domain.service;

import com.SYCDMU.MosqueraPilaAPI.domain.Admin;
import com.SYCDMU.MosqueraPilaAPI.domain.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAll(){
        return adminRepository.getAll();
    }

    public List<Admin> getByCedula(String id){
        return adminRepository.getByCedula(id);
    }

    public List<Admin> getByNombre(String names){
        return adminRepository.getByNombre(names);
    }
}
