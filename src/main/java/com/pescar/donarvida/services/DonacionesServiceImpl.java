package com.pescar.donarvida.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pescar.donarvida.models.Donaciones;
import com.pescar.donarvida.repository.DonacionesDao;

@Service
public class DonacionesServiceImpl implements DonacionesService {

    @Autowired
    private DonacionesDao donacionesDao;

    @Transactional(readOnly = true)
    @Override
    public List<Donaciones> listarDonaciones() {
        return (List<Donaciones>) this.donacionesDao.findAll();
    }

}