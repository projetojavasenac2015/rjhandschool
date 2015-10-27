package rj.handschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rj.handschool.model.Users;

@Controller
public class LoginController {
	@RequestMapping("/")
	public String logar(){
		return "login/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String efetuarLogin(@ModelAttribute(value="login") Users user){
		System.out.println(user.getUsuario());
		return "login/login";
	}
}
