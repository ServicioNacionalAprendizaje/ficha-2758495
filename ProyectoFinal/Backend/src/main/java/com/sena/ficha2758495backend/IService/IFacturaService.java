package com.sena.ficha2758495backend.IService;

import java.util.List;
import java.util.Optional;

import com.sena.ficha2758495backend.Entity.Factura;

public interface IFacturaService {
	
	//Recuperar todos los datos de la entidad
	List<Factura> All();
	
	//Consultar registro por ID
	Optional<Factura> findById(Long id);
	
	//Guardar registro de la entidad
	Factura Save(Factura factura);
	
	//Modificar el registro de cliente
	void Update (Factura factura, Long id);
	
	//Eliminar registro
	void Delete (Long id);

}
