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

    @Override
    @Transactional(readOnly = true)
    public boolean existe(Donaciones donacion) {
        return donacion.getId() != null && donacionesDao.existsById(donacion.getId());
    }

    @Override
    @Transactional
    public void actualizar(Donaciones donacion) {
        Donaciones donacionbd = this.encontrarDonacion(donacion);
		donacionbd.setNombre(donacionbd.getNombre());
		donacionbd.setApellido(donacionbd.getApellido());
        donacionbd.setEdad(donacionbd.getEdad());
		donacionbd.setLocalidad(donacionbd.getLocalidad());
		donacionbd.setCelular(donacionbd.getCelular());
		donacionbd.setTipoSangre(donacionbd.getTipoSangre());
    }

    @Override
    @Transactional(readOnly = true)
    public Donaciones encontrarDonacion(Donaciones donacion) {
        return donacionesDao.findById(donacion.getId()).orElse(null);
    }

    @Override
    @Transactional
    public void guardar(Donaciones donacion) {
        donacionesDao.save(donacion);
    }

}