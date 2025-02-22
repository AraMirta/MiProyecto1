package com.example.demo.repositoryDao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {
	
	@PersistenceContext
	private EntityManager entityManager;


	@Override
	public List<Usuario> obtenerUsuario() {
		
		String query = "from Usuario";
		
		return entityManager.createQuery(query).getResultList();
		
		
	}
	
	

}
