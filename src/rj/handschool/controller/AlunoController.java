package rj.handschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlunoController {
	@RequestMapping("/aluno")
	public String teste(){
		return "index";
	}
}
