package com.apirest.original.Services;

import java.util.List;

import com.apirest.original.Models.Cliente;

public interface ClienteService {

	List<Cliente> listarTodos();
	
	Cliente listarPorId(Long id);
	
	Cliente cadastrar(Cliente cliente);
	
	Cliente atualizar(Cliente cliente);
	
	void deletar(Long id);
}
