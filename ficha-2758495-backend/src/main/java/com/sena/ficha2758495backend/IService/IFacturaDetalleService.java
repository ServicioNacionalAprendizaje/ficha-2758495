package com.sena.ficha2758495backend.IService;

import java.util.List;
import java.util.Optional;

import com.sena.ficha2758495backend.Entity.FacturaDetalle;

public interface IFacturaDetalleService {
	
	//Recuperar todos los datos de la entidad
	List<FacturaDetalle> All();
	
	//Consultar registro por ID
	Optional<FacturaDetalle> findById(Long id);
	
	//Guardar registro de la entidad
	FacturaDetalle Save(FacturaDetalle facturaDetalle);
	
	//Modificar el registro de cliente
	void Update (FacturaDetalle facturaDetalle, Long id);
	
	//Eliminar registro
	void Delete (Long id);

}
