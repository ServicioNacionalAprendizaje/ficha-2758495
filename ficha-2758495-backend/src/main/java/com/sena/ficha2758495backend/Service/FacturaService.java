package com.sena.ficha2758495backend.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.ficha2758495backend.Entity.Factura;
import com.sena.ficha2758495backend.IRepository.IFacturaRepository;
import com.sena.ficha2758495backend.IService.IFacturaService;

@Service
public class FacturaService implements IFacturaService{

	@Autowired
	private IFacturaRepository repository;
	
	@Override
	public List<Factura> All() {
		return repository.findAll();
	}

	@Override
	public Optional<Factura> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Factura Save(Factura factura) {
		return repository.save(factura);
	}

	@Override
	public void Update(Factura factura, Long id) {
		//Consultar si existe el registro
				Optional<Factura> op = repository.findById(id);
				
				if(op.isEmpty()){
					System.out.print("Registro no existe.");
				}else {
					Factura updateFactura = op.get();					
					updateFactura.setFecha(LocalDateTime.now());
					updateFactura.setTotalPagar(factura.getTotalPagar());
					updateFactura.setClienteId(factura.getClienteId());					
					repository.save(updateFactura);
				}	
		
	}

	@Override
	public void Delete(Long id) {
		repository.deleteById(id);		
	}

}
