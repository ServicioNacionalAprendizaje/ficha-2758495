package com.sena.ficha2758495backend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.ficha2758495backend.Entity.Producto;
import com.sena.ficha2758495backend.IRepository.IProductoRepository;
import com.sena.ficha2758495backend.IService.IProductoService;

@Service
public class ProductoService implements IProductoService{

	@Autowired
	private IProductoRepository repository;
	
	@Override
	public List<Producto> All() {
		return repository.findAll();
	}

	@Override
	public Optional<Producto> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Producto Save(Producto producto) {
		return repository.save(producto);
	}

	@Override
	public void Update(Producto producto, Long id) {
		//Consultar si existe el registro
				Optional<Producto> op = repository.findById(id);
				
				if(op.isEmpty()){
					System.out.print("Registro no existe.");
				}else {
					Producto updateProducto = op.get();					
					updateProducto.setNombre(producto.getNombre());
					updateProducto.setDescripcion(producto.getDescripcion());
					updateProducto.setPrecio(producto.getPrecio());	
					updateProducto.setStock(producto.getStock());
					updateProducto.setPrecio(producto.getPrecio());
					repository.save(updateProducto);
				}	
		
	}

	@Override
	public void Delete(Long id) {
		repository.deleteById(id);		
	}

}
