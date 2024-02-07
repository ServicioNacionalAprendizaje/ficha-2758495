package com.sena.ficha2758495backend.IService;

import java.util.List;
import java.util.Optional;

import com.sena.ficha2758495backend.Entity.Producto;

public interface IProductoService {
	
	//Recuperar todos los datos de la entidad
	List<Producto> All();
	
	//Consultar registro por ID
	Optional<Producto> findById(Long id);
	
	//Guardar registro de la entidad
	Producto Save(Producto producto);
	
	//Modificar el registro de cliente
	void Update (Producto producto, Long id);
	
	//Eliminar registro
	void Delete (Long id);

}
