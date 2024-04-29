package com.example.active_fit_back.services.impl;


import com.example.active_fit_back.model.Rol;
import com.example.active_fit_back.repository.RolRepository;
import com.example.active_fit_back.services.RolService;
import com.example.active_fit_back.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepository RolRepository;

    @Override
    public List<Rol> findAll() {
        List<Rol> rols = RolRepository.findAll();
        return rols;
    }

    @Override
    public Long save(Rol rol) {
        return  rol.getId();
    }

    @Override
    public void delete(Long id) {
        if (RolRepository.existsById(id)) {
            RolRepository.deleteById(id);
        }
    }

    @Override
    public void update(Long id, Rol rol) {
        if (RolRepository.existsById(id)) {
            RolRepository.save(rol);
        } else {
            throw new RuntimeException("No se encontro el Rol");
        }

    }
}
