package com.proyecto.pagos.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.pagos.db.usuarioDAO;
import com.proyecto.pagos.entities.usuario;


@RestController
public class usuarioController {
	
	@Autowired
	usuarioDAO usuarioDAO;
	
	@PostMapping("/usuario/sesion{usuario}")
	public Boolean getIniciar_Sesion(@RequestBody usuario usuario){
		System.out.println(usuario.getContraseña());
		return usuarioDAO.iniciar_sesion(usuario);
	}
	
	@PostMapping("/usuario/crear{usuario}")
	public Boolean postCrear_Usuario(@RequestBody usuario usuario) {
		return usuarioDAO.insertar(usuario);
	}
}