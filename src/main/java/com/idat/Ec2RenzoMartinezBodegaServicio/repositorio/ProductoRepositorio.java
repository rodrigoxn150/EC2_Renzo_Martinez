package com.idat.Ec2RenzoMartinezBodegaServicio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Ec2RenzoMartinezBodegaServicio.modelo.Productos;

@Repository
public interface ProductoRepositorio extends JpaRepository< Productos, Integer>{


}
