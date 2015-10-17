package rj.handschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MateriaController {
	@RequestMapping("/CadastramentoMateria")
	public String incluirMateria(){
		return "materia/nova_materia";
	}
}
