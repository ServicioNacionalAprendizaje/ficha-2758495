package com.sena.ficha2758495backend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.ficha2758495backend.Entity.DetalleFactura;
import com.sena.ficha2758495backend.IRepository.IDetalleFacturaRepository;
import com.sena.ficha2758495backend.IService.IDetalleFacturaService;

@Service
public class DetalleFacturaService implements IDetalleFacturaService{

	@Autowired
	private IDetalleFacturaRepository repository;
	
	@Override
	public List<DetalleFactura> All() {
		return repository.findAll();
	}

	@Override
	public Optional<DetalleFactura> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public DetalleFactura Save(DetalleFactura detalleFactura) {
		return repository.save(detalleFactura);
	}

	@Override
	public void Update(DetalleFactura detalleFactura, Long id) {
		//Consultar si existe el registro
				Optional<DetalleFactura> op = repository.findById(id);
				
				if(op.isEmpty()){
					System.out.print("Registro no existe.");
				}else {
					DetalleFactura updateDetalleFactura = op.get();					
					updateDetalleFactura.setCantidad(detalleFactura.getCantidad());
					updateDetalleFactura.setTotalFactura(detalleFactura.getTotalFactura());
					updateDetalleFactura.setProductoId(detalleFactura.getProductoId());	
					updateDetalleFactura.setFacturaId(detalleFactura.getFacturaId());
					updateDetalleFactura.setEstado(detalleFactura.getEstado());
					repository.save(updateDetalleFactura);
				}	
		
	}

	@Override
	public void Delete(Long id) {
		repository.deleteById(id);		
	}

}
