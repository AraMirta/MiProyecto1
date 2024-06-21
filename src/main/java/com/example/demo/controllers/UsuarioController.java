package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Usuario;
import com.example.demo.repositoryDao.UsuarioDao;


@RestController
public class UsuarioController {
	@Autowired
	private UsuarioDao usuarioDao;
	
	/*
	@RequestMapping(value="mensaje")
	public String mensaje() {
		
		return "Hola";
	}

	@RequestMapping(value="persona")
	public List<String> listarPersonas(){
		
		return List.of("Mirta","Anto","Yane");
		
	}
	*/
	/*
	@RequestMapping(value="usuarios")
	public Usuario listarUsuarios() {
		
		Usuario usuario=new Usuario();
		usuario.setNombre("Mirta");
		usuario.setApellido("Arabel");
		usuario.setEmail("arabelmirta@gmail.com");
		usuario.setTelefono("2616802456");
		
		return usuario;
	}
	*/
	/*
	@RequestMapping(value="usuario/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		
		Usuario usuario=new Usuario();
		usuario.setId(id);
		usuario.setNombre("Mirta");
		usuario.setApellido("Arabel");
		usuario.setEmail("arabelmirta@gmail.com");
		usuario.setTelefono("2616802456");
		
		return usuario;
	}
	*/
	
	@RequestMapping(value="listar/usuario")
	public List<Usuario> listar_variosUsuario() {
		
		List<Usuario> usuarios=new ArrayList<>();
		
		Usuario usuario1=new Usuario();
		usuario1.setId(3L);
		usuario1.setNombre("Mirta");
		usuario1.setApellido("Arabel");
		usuario1.setEmail("arabelmirta@gmail.com");
		usuario1.setTelefono("2616802456");
		
		Usuario usuario2=new Usuario();
		usuario2.setId(4L);
		usuario2.setNombre("Anto");
		usuario2.setApellido("Castro");
		usuario2.setEmail("anto.castro@gmail.com");
		usuario2.setTelefono("2615391293");
		
		Usuario usuario3=new Usuario();
		usuario3.setId(5L);
		usuario3.setNombre("Yane");
		usuario3.setApellido("Castro");
		usuario3.setEmail("yane.castro@gmail.com");
		usuario3.setTelefono("2615826066");

		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
				
		return usuarios;
	}
	
	@RequestMapping(value="api/usuario")
	public List<Usuario> getUsuario(){
		
		List<Usuario> user=UsuarioDao.obtenerUsuario();
		
		return user;
		
	}
	
	
}
