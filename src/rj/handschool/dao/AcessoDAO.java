package rj.handschool.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import rj.handschool.model.Acesso;
import rj.handschool.model.Perfil;


@Repository
public class AcessoDAO {

	@Autowired
	private SessionFactory sessionFactory;
		
	public Acesso findById(int id){
		return (Acesso) getSession().get(Acesso.class, id);	
	}
	public List<Acesso>  findByPerfil(Perfil perfil) throws Exception{
		
		try {
			List<Acesso> list = null;
			
			list =getSession().createCriteria(Acesso.class).add(Restrictions.eq("perfil.idPerfil", perfil.getIdPerfil())).list();
			
			return  list;
		}catch(Exception ex){
 			throw new Exception("Erro ao Consultar Acessos por Perfil:"+ex.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Acesso> findAll(){
		return getSession().createCriteria(Acesso.class).list();
	}
	
	
	private Session getSession() {
		Session sess = getSessionFactory().getCurrentSession();
		if (sess == null) {
			sess = getSessionFactory().openSession();
		}
		return sess;
	}

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
}
