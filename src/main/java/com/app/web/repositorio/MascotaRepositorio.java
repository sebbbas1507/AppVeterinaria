package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidades.Mascota;

@Repository
public interface MascotaRepositorio extends JpaRepository<Mascota, Long> {

	
}
