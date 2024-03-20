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

import com.sena.ficha2758495backend.Entity.Factura;
import com.sena.ficha2758495backend.IService.IFacturaService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/Factura")
public class FacturaController {

	@Autowired
	private IFacturaService service;
	
	@GetMapping
	public List<Factura> All(){
		return service.All();
	}
	
	@GetMapping("/{id}")
	public Optional<Factura> FindById(@PathVariable Long id){
		return service.findById(id);
	}
	
	@PostMapping
	public Factura FindById(@RequestBody Factura factura){
		return service.Save(factura);
	}	
	
	@PutMapping("/{id}")
	public void Update(@RequestBody Factura factura, @PathVariable Long id){
		service.Update(factura, id);
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable Long id){
		service.Delete(id);
	}
}
