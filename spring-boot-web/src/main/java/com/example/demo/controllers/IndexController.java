package com.example.demo.controllers;

import com.example.demo.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/intranet_InspectoriaPNP") 
public class IndexController {

	@GetMapping("/index")
	public String index(){

		return "index";		
	}
	
	//@GetMapping(value="/index") 
	//@GetMapping({"/index", "/", "", "/home"})
	@GetMapping({"/login", "/", ""})
	public String login(){
		
		return "login";		
	}
	
	
	@GetMapping("/password")
	public String password(){	
		
		return "password";		
	}
	
	
	@GetMapping("/register")
	public String register(){

		return "register";		
	}
	
	@GetMapping("/practice")
	public String practice(){

		return "practice";		
	}
	
	@GetMapping("/formDirector")
	public String formDirector(){

		return "formularioDirector";		
	}
	
	
	@GetMapping("/usuario")
	public String usuario(Model model){
		
		Usuario usuario = new Usuario();
		usuario.setNombres("Guillermo");
		usuario.setApellidoPaterno("MEDINA");
		usuario.setApellidoMaterno("ZEGARRA");
		
		model.addAttribute("usuario", usuario); 		
		model.addAttribute("titulo", "Perfil de usuario: ".concat(usuario.getNombres() + usuario.getApellidoPaterno() + usuario.getApellidoMaterno()));

		return "usuario";		
	}
	
}




