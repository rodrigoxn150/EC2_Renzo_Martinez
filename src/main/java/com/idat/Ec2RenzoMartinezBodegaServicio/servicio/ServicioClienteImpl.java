package com.idat.Ec2RenzoMartinezBodegaServicio.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Ec2RenzoMartinezBodegaServicio.dto.ClienteDTORequest;
import com.idat.Ec2RenzoMartinezBodegaServicio.dto.ClienteDTOResponse;
import com.idat.Ec2RenzoMartinezBodegaServicio.modelo.Cliente;

import com.idat.Ec2RenzoMartinezBodegaServicio.repositorio.ClienteRepositorio;
@Service
public class ServicioClienteImpl implements ClienteServicio{

	@Autowired
	public ClienteRepositorio repositorio;

	@Override
	public void guardarCliente(ClienteDTORequest cliente) {
		Cliente c = new Cliente();
		c.setNombre(cliente.getNombreDTO());
		c.setDireccion(cliente.getDireccionDTO());
		c.setDni(cliente.getDniDTO());
		
		repositorio.save(c);
		
	}

	@Override
	public void editarCliente(ClienteDTORequest cliente) {
		Cliente c = new Cliente();
		c.setNombre(cliente.getNombreDTO());
		c.setDireccion(cliente.getDireccionDTO());
		c.setDni(cliente.getDniDTO());
		repositorio.saveAndFlush(c);
		
	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<ClienteDTOResponse> listarClientes() {
		List<ClienteDTOResponse> lista = new ArrayList<ClienteDTOResponse>();
		ClienteDTOResponse c = null; 
		

		for (Cliente cliente :repositorio.findAll()) {
			c = new ClienteDTOResponse();
			
			c.setNormbreDTO(cliente.getNombre());
			c.setIdClienteDTO(cliente.getIdCliente());
			c.setDireccionDTO(cliente.getDireccion());
			c.setDniDTO(cliente.getDni());
	
			
			lista.add(c);
			
		}
		return lista;
	}

	@Override
	public ClienteDTOResponse obtenerClienteId(Integer id) {
		Cliente cliente = repositorio.findById(id).orElse(null);
		ClienteDTOResponse c = new ClienteDTOResponse();
		c.setNormbreDTO(cliente.getNombre());
		c.setIdClienteDTO(cliente.getIdCliente());
		c.setDireccionDTO(cliente.getDireccion());
		c.setDniDTO(cliente.getDni());
		return c;
		
	}
	

}
