package rj.handschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TurmaController {
	@RequestMapping(value="/CadastramentoTurma")
	public String cadastramento(){
		return "turma/nova_turma";
	}
}
