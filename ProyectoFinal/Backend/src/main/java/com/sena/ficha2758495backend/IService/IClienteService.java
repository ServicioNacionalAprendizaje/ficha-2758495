package com.sena.ficha2758495backend.IService;

import java.util.List;
import java.util.Optional;

import com.sena.ficha2758495backend.Entity.Cliente;

public interface IClienteService {
	
	//Recuperar todos los datos de la entidad
	List<Cliente> All();
	
	//Consultar registro por ID
	Optional<Cliente> findById(Long id);
	
	//Guardar registro de la entidad
	Cliente Save(Cliente cliente);
	
	//Modificar el registro de cliente
	void Update (Cliente cliente, Long id);
	
	//Eliminar registro
	void Delete (Long id);

}
