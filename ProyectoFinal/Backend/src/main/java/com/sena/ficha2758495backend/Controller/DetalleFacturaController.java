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

import com.sena.ficha2758495backend.Entity.DetalleFactura;
import com.sena.ficha2758495backend.IService.IDetalleFacturaService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/DetalleFactura")
public class DetalleFacturaController {

	@Autowired
	private IDetalleFacturaService service;
	
	@GetMapping
	public List<DetalleFactura> All(){
		return service.All();
	}
	
	@GetMapping("/{id}")
	public Optional<DetalleFactura> FindById(@PathVariable Long id){
		return service.findById(id);
	}
	
	@PostMapping
	public DetalleFactura FindById(@RequestBody DetalleFactura detalleFactura){
		return service.Save(detalleFactura);
	}	
	
	@PutMapping("/{id}")
	public void Update(@RequestBody DetalleFactura detalleFactura, @PathVariable Long id){
		service.Update(detalleFactura, id);
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable Long id){
		service.Delete(id);
	}
}
