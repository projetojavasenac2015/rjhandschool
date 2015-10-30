package rj.handschool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rj.handschool.dao.AcessoDAO;
import rj.handschool.dao.LoginDAO;
import rj.handschool.service.LoginService;
import rj.handschool.model.Acesso;
import rj.handschool.model.Login;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO loginDAO;
	
	@Transactional
	public void insert(Login login) throws Exception {
		this.loginDAO.insert(login);
	}

	@Transactional
	public void update(Login login) throws Exception {
		this.loginDAO.update(login);
		
	}

	@Transactional(readOnly=true)
	public List<Login> findAll() {
		return loginDAO.findAll();
	}

	@Transactional(readOnly=true)
	public Login findById(Integer id) {
		return loginDAO.findById(id);
	}

	@Transactional(readOnly=true)
	public Login findByMatricula(String matricula) throws Exception {
		Login l = loginDAO.findByMatricula(matricula);
		return l;
	}

}
