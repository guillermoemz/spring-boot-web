package com.example.demo.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.models.entity.Usuario;


//@Repository("ClienteDaoJPA") 
@Repository
public class UsuarioDaoImpl implements IUsuarioDao {

	@PersistenceContext 
	private EntityManager em; 
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Usuario").getResultList();
	}
	
	

}
