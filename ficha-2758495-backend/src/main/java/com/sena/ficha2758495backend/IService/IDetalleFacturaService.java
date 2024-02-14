package com.sena.ficha2758495backend.IService;

import java.util.List;
import java.util.Optional;

import com.sena.ficha2758495backend.Entity.DetalleFactura;

public interface IDetalleFacturaService {
	
	//Recuperar todos los datos de la entidad
	List<DetalleFactura> All();
	
	//Consultar registro por ID
	Optional<DetalleFactura> findById(Long id);
	
	//Guardar registro de la entidad
	DetalleFactura Save(DetalleFactura facturaDetalle);
	
	//Modificar el registro de cliente
	void Update (DetalleFactura facturaDetalle, Long id);
	
	//Eliminar registro
	void Delete (Long id);

}
