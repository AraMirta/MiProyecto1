package com.example.demo.repositoryDao;

import java.util.List;

import com.example.demo.modelo.Usuario;

import jakarta.transaction.Transactional;

@Transactional
public interface UsuarioDao {
	
	List<Usuario> obtenerUsuario();

}
