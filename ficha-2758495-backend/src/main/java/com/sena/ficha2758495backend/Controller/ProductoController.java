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

import com.sena.ficha2758495backend.Entity.Producto;
import com.sena.ficha2758495backend.IService.IProductoService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/Producto")
public class ProductoController {

	@Autowired
	private IProductoService service;
	
	@GetMapping
	public List<Producto> All(){
		return service.All();
	}
	
	@GetMapping("/{id}")
	public Optional<Producto> FindById(@PathVariable Long id){
		return service.findById(id);
	}
	
	@PostMapping
	public Producto FindById(@RequestBody Producto producto){
		return service.Save(producto);
	}	
	
	@PutMapping("/{id}")
	public void Update(@RequestBody Producto producto, @PathVariable Long id){
		service.Update(producto, id);
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable Long id){
		service.Delete(id);
	}
}
