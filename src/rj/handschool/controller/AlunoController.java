package rj.handschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlunoController {
	@RequestMapping("/a")
	public String teste(){
		System.out.println("aqui");
		return "teste";
	}
}