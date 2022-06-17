package com.idat.Ec2RenzoMartinezBodegaServicio.servicio;

import java.util.List;

import com.idat.Ec2RenzoMartinezBodegaServicio.dto.ClienteDTORequest;
import com.idat.Ec2RenzoMartinezBodegaServicio.dto.ClienteDTOResponse;



public interface ClienteServicio {

	public void guardarCliente(ClienteDTORequest cliente);
	public void editarCliente(ClienteDTORequest cliente);
	
	public void eliminarCliente(Integer id);
	
	public List<ClienteDTOResponse> listarClientes();
	public ClienteDTOResponse obtenerClienteId(Integer id);
}
