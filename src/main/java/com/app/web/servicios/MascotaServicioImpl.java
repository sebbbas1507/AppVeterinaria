package com.app.web.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidades.Mascota;
import com.app.web.repositorio.MascotaRepositorio;

@Service
public class MascotaServicioImpl implements MascotaServicio{

	@Autowired
	private MascotaRepositorio repositorio;
	
	@Override
	public List<Mascota> listarTodasLasMascotas() {
		return repositorio.findAll();
	}

}
