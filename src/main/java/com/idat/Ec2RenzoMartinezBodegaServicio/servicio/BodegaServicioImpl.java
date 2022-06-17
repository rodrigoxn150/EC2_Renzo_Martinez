package com.idat.Ec2RenzoMartinezBodegaServicio.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Ec2RenzoMartinezBodegaServicio.dto.BodegaDTORequest;
import com.idat.Ec2RenzoMartinezBodegaServicio.dto.BodegaDTOResponse;
import com.idat.Ec2RenzoMartinezBodegaServicio.modelo.Bodega;
import com.idat.Ec2RenzoMartinezBodegaServicio.repositorio.BodegaRepositorio;


@Service
public class BodegaServicioImpl implements BodegaServicio{
	@Autowired
	public BodegaRepositorio repositorio;
	@Override
	public void guardarBodega(BodegaDTORequest bodega) {
		Bodega b = new Bodega();
		b.setNombre(bodega.getNombreDTO());
		b.setDireccion(bodega.getDireccionDTO());
	
		
		repositorio.save(b);
		
	}

	@Override
	public void editarBodega(BodegaDTORequest bodega) {
		// TODO Auto-generated method stub
		Bodega b = new Bodega();
		b.setNombre(bodega.getNombreDTO());
		b.setDireccion(bodega.getDireccionDTO());
		repositorio.saveAndFlush(b);
		
	}

	@Override
	public void eliminarBodega(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
		
	}

	@Override
	public List<BodegaDTOResponse> listarBodega() {
		List<BodegaDTOResponse> lista = new ArrayList<BodegaDTOResponse>();
		BodegaDTOResponse b = null; 
		

		for (Bodega bodega :repositorio.findAll()) {
			b = new BodegaDTOResponse();
			
			b.setNombreDTO(bodega.getNombre());
			b.setIdBodegaDTO(bodega.getIdBodega());
			b.setDireccionDTO(bodega.getDireccion());
	
			lista.add(b);
			
		}
		return lista;
	}

	@Override
	public BodegaDTOResponse obtenerBodegaId(Integer id) {
		Bodega bodega = repositorio.findById(id).orElse(null);
		BodegaDTOResponse b = new BodegaDTOResponse();
		b.setNombreDTO(bodega.getNombre());
		b.setIdBodegaDTO(bodega.getIdBodega());
		b.setDireccionDTO(bodega.getDireccion());
		return b;
	}

}
