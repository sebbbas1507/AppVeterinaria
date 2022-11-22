package com.app.web.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.web.servicios.MascotaServicio;

@Controller
public class MascotaControlador {

	@Autowired 
	private MascotaServicio servicio;
	
	@GetMapping("/mascotas")
	public String listarMascotas(Model modelo) {
		modelo.addAttribute("mascotas", servicio.listarTodasLasMascotas());  
		return "mascotas";
	}
}
