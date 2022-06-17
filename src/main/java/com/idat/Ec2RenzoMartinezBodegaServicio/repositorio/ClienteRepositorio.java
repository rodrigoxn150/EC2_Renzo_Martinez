package com.idat.Ec2RenzoMartinezBodegaServicio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.Ec2RenzoMartinezBodegaServicio.modelo.Cliente;


public interface ClienteRepositorio extends JpaRepository < Cliente, Integer> {

}
