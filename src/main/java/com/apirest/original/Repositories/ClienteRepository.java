package com.apirest.original.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.original.Models.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Long>{

}
