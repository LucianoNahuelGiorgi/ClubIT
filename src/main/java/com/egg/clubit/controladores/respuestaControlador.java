package com.egg.clubit.controladores;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.egg.clubit.entidades.Posteo;
import com.egg.clubit.errorservicio.ErrorServicio;
import com.egg.clubit.servicios.PosteoServicio;
import com.egg.clubit.servicios.RespuestaServicio;




@Controller
@RequestMapping("/")
public class respuestaControlador {
	@Autowired
	RespuestaServicio respuestaServicio;
	
	
	@Autowired
	PosteoServicio posteoServicio;
	
	
	
	@PostMapping("/posteo/{id}/respuesta")
	public String respuesta(ModelMap modelo,@RequestParam String idPost, @RequestParam String respuestaRTA) throws ErrorServicio    {
		try {
			respuestaServicio.crearRespuesta(idPost,respuestaRTA);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "redirect:/";
	}
	
	
	
	


}