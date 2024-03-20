package com.sena.ficha2758495backend.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.ficha2758495backend.Entity.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {

}
