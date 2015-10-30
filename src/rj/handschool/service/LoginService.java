package rj.handschool.service;

import java.util.List;

import rj.handschool.model.Login;

public interface LoginService {
	/*
	 * CREATE and UPDATE 
	 */
	public void insert(Login login) throws Exception;
	public void update(Login login) throws Exception;

	/*
	 * READ
	 */
	public List<Login> findAll();
	public Login findById(Integer id);
	public Login findByMatricula(String matricula) throws Exception; 

}
