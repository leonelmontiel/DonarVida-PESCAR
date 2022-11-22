package com.pescar.donarvida.services;

import java.util.List;

import com.pescar.donarvida.models.Donaciones;

public interface DonacionesService {

    public List<Donaciones> listarDonaciones();

    public boolean existe(Donaciones donacion);

    public void actualizar(Donaciones donacion);

    public void guardar(Donaciones donacion);

    public Donaciones encontrarDonacion(Donaciones donacion);

}
