package com.idat.Ec2RenzoMartinezBodegaServicio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Ec2RenzoMartinezBodegaServicio.modelo.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{
	
	Usuario findByUsuario(String usuario);

}
