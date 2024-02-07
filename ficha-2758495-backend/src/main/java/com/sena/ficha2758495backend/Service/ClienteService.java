package com.sena.ficha2758495backend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.ficha2758495backend.Entity.Cliente;
import com.sena.ficha2758495backend.IRepository.IClienteRepository;
import com.sena.ficha2758495backend.IService.IClienteService;

@Service
public class ClienteService implements IClienteService{

	@Autowired
	private IClienteRepository repository;
	
	@Override
	public List<Cliente> All() {
		return repository.findAll();
	}

	@Override
	public Optional<Cliente> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Cliente Save(Cliente cliente) {
		return repository.save(cliente);
	}

	@Override
	public void Update(Cliente cliente, Long id) {
		//Consultar si existe el registro
				Optional<Cliente> op = repository.findById(id);
				
				if(op.isEmpty()){
					System.out.print("Registro no existe.");
				}else {
					Cliente updateCliente = op.get();					
					updateCliente.setNombre(cliente.getNombre());
					updateCliente.setApellido(cliente.getApellido());
					updateCliente.setCorreo(cliente.getCorreo());
					updateCliente.setTelefono(cliente.getTelefono());			
					
					repository.save(updateCliente);
				}	
		
	}

	@Override
	public void Delete(Long id) {
		repository.deleteById(id);		
	}

}
