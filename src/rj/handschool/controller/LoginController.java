package rj.handschool.controller;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.security.authentication.LockedException;

import rj.handschool.service.LoginService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

	 @Autowired  
	private LoginService loginService;
	
	@RequestMapping(value={ "/","loginForm"},method=RequestMethod.GET)
	public String loginForm(){
		return "login/login-form";		
	}
	
	@RequestMapping(value="loginError",method=RequestMethod.GET)
	public String loginError(Model model,HttpServletRequest request){
		model.addAttribute("error", getErrorMessage(request, "SPRING_SECURITY_LAST_EXCEPTION"));
		return "login/login-form";		
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session){		
		session.invalidate();
		return "redirect:loginForm";
	}
	
	@RequestMapping("acessoNegado")
	public String acessoNegado(){
		return "403";
	}
	
	@RequestMapping("menuPortal")
	public String menuPrimeiroAcesso(Principal principal, HttpSession session) throws Exception{
		String matricula = principal.getName();
		session.setAttribute("LoginAtivo", loginService.findByMatricula(matricula));	
		return "menu/menu-portal";
	}
	
	@RequestMapping("menuInicial")
	public String menuPortal(){
		return "menu/menu-portal";
	}
	
    private String getErrorMessage(HttpServletRequest request, String key){
		
			Exception exception = 
	                   (Exception) request.getSession().getAttribute(key);
			
			String error = "";
			if (exception instanceof BadCredentialsException) {
				error = "Matricula e/ou Senha Inválida!";
			}else if(exception instanceof LockedException) {
				error = exception.getMessage();
			}else{
				error = exception.getMessage();
			}
			
			return error;
		}
}
