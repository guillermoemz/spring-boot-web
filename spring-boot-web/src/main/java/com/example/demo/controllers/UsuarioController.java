package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.dao.IUsuarioDao;
import com.example.demo.models.entity.Usuario;

@Controller
@RequestMapping("/intranet_InspectoriaPNP") 
public class UsuarioController {
	
	@Autowired 
	//@Qualifier("ClienteDaoJPA")
	//--> para ser más detallado en la especificación  
	private IUsuarioDao usuarioDao; 
	
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
	
	
	@GetMapping("/formInspector")
	public String formInspector(){	return "formularioInspector";	}
	
	@GetMapping("/formDirectorInvestigaciones")
	public String formDirectorInvestigaciones(){	return "formularioDIR-INV";	}
	
	@GetMapping("/formDirectorInspecciones")
	public String formDirectorInspecciones(){	return "formularioDIR-INSP";	}
	
	@GetMapping("/cambiarPassword")
	public String cambiarPassword(){	return "cambiarPassword";	} 
	
	
	@GetMapping("/lecturasInteres")
	public String lecturasInteres(){	return "/Normas/lecturasInteres";	}
	
	
	/*
	// PERSONAL PNP DE LA DIRECCION DE INSPECCIONES DE LA IG PNP 
	@GetMapping("/OficialesPNP")
	public String OficialesPNP(){	
	
		return "/Inscritos/OficialesPNP";	
	
	}
	*/
	
	//@RequestMapping(value="/OficialesPNP", method=RequestMethod.GET)
	@GetMapping("/OficialesPNP")
	public String OficialesPNP(Model model)
	{
		model.addAttribute("titulo", "Listado de clientes");
		model.addAttribute("usuarios", usuarioDao.findAll()); 
		return "/Inscritos/OficialesPNP";		
	}

	
	@GetMapping("/SuboficialesPNP")
	public String SuboficialesPNP(){	return "/Inscritos/SuboficialesPNP";	}
		
	
	
	// RCG 
	@GetMapping("/RCG_2020")
	public String RCG_2020(){	return "/Normas/RCG_PNP/RCG_2020";	}
	
	@GetMapping("/RCG_2019")
	public String RCG_2019(){	return "/Normas/RCG_PNP/RCG_2019";	}
	
	@GetMapping("/RCG_all")
	public String RCG_all(){	return "/Normas/RCG_PNP/RCG_all";	}
	
	
	
	// RD 
	@GetMapping("/RD_2019")
	public String RD_2019(){	return "/Normas/RD_PNP/RD_2019";	}
	
	@GetMapping("/RD_2018")
	public String RD_2018(){	return "/Normas/RD_PNP/RD_2018";	}
	
	@GetMapping("/RD_2017")
	public String RD_2017(){	return "/Normas/RD_PNP/RD_2017";	}
	
	@GetMapping("/RD_2016")
	public String RD_2016(){	return "/Normas/RD_PNP/RD_2016";	}
	
	@GetMapping("/RD_2015")
	public String RD_2015(){	return "/Normas/RD_PNP/RD_2015";	}
	
	@GetMapping("/RD_2014")
	public String RD_2014(){	return "/Normas/RD_PNP/RD_2014";	}
	
	@GetMapping("/RD_2013")
	public String RD_2013(){	return "/Normas/RD_PNP/RD_2013";	}
	
	@GetMapping("/RD_2011")
	public String RD_2011(){	return "/Normas/RD_PNP/RD_2011";	}
	
	@GetMapping("/RD_2008")
	public String RD_2008(){	return "/Normas/RD_PNP/RD_2008";	}

	@GetMapping("/RD_all")
	public String RD_all(){		return "/Normas/RD_PNP/RD_all";		}
	
	
	// Normas Complementarias
	@GetMapping("/NormasComplementariasDS")
	public String NormasComplementariasDS(){	return "/Normas/NormasComplementarias/DecretoSupremo";	}
	
	@GetMapping("/NormasComplementariasRM")
	public String NormasComplementariasRM(){	return "/Normas/NormasComplementarias/ResolucionMinisterial";	}

	@GetMapping("/NormasComplementariasRD")
	public String NormasComplementariasRD(){	return "/Normas/NormasComplementarias/ResolucionesDirectoralesExternas";	}
	
	@GetMapping("/NormasComplementariasDL")
	public String NormasComplementariasDL(){	return "/Normas/NormasComplementarias/DecretoLegislativos";	}

	@GetMapping("/NormasComplementarias")
	public String NormasComplementarias(){	return "/Normas/NormasComplementarias/Normas_all";	}


	
	
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




