package com.sena.ficha2758495backend.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.ficha2758495backend.Entity.Cliente;
import com.sena.ficha2758495backend.IService.IClienteService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/Cliente")
public class ClienteController {

	@Autowired
	private IClienteService service;
	
	@GetMapping
	public List<Cliente> All(){
		return service.All();
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> FindById(@PathVariable Long id){
		return service.findById(id);
	}
	
	@PostMapping
	public Cliente FindById(@RequestBody Cliente cliente){
		return service.Save(cliente);
	}	
	
	@PutMapping("/{id}")
	public void Update(@RequestBody Cliente cliente, @PathVariable Long id){
		service.Update(cliente, id);
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable Long id){
		service.Delete(id);
	}
}
