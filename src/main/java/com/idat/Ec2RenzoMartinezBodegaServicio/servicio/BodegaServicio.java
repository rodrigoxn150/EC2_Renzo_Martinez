package com.idat.Ec2RenzoMartinezBodegaServicio.servicio;

import java.util.List;

import com.idat.Ec2RenzoMartinezBodegaServicio.dto.BodegaDTORequest;
import com.idat.Ec2RenzoMartinezBodegaServicio.dto.BodegaDTOResponse;



public interface BodegaServicio {
	public void guardarBodega(BodegaDTORequest bodega);
	public void editarBodega(BodegaDTORequest bodega);
	
	public void eliminarBodega(Integer id);
	
	public List<BodegaDTOResponse> listarBodega();
	public BodegaDTOResponse obtenerBodegaId(Integer id);
}
