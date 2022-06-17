package com.idat.Ec2RenzoMartinezBodegaServicio.servicio;

import java.util.List;

import com.idat.Ec2RenzoMartinezBodegaServicio.dto.ProductoDTORequest;
import com.idat.Ec2RenzoMartinezBodegaServicio.dto.ProductoDTOResponse;

public interface ProductoServicio {

	
	public void guardarProducto(ProductoDTORequest producto);
	public void editarProducto(ProductoDTORequest producto);
	
	public void eliminarProducto(Integer id);
	
	public List<ProductoDTOResponse> listarProductos();
	public ProductoDTOResponse obtenerProductoId(Integer id);
}
