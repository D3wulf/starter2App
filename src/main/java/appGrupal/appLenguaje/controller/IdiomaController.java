package appGrupal.appLenguaje.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import starter.miArtefacto.Idioma;
import starter.miArtefacto.config.IdiomaProperties;

@RestController
public class IdiomaController {
	
	
	
	@Autowired
	private IdiomaProperties ip;
	
	@GetMapping("/")
	public String pruebaIdioma() {
		
		//ip.setLenguaje("Ingles");
		System.out.println(ip.getLenguaje());
		return ip.getLenguaje();
	}
	
	
	

}
