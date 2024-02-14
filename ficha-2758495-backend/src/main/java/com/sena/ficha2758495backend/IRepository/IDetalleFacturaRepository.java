package com.sena.ficha2758495backend.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.ficha2758495backend.Entity.DetalleFactura;

public interface IDetalleFacturaRepository extends JpaRepository<DetalleFactura, Long> {

}
