package com.apirest.original.Services.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.original.Models.Cliente;
import com.apirest.original.Repositories.ClienteRepository;
import com.apirest.original.Services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepo;

	@Override
	public List<Cliente> listarTodos() {
		return this.clienteRepo.findAll();
	}

	@Override
	public Cliente listarPorId(Long id) {
		return this.clienteRepo.findById(id).get();
	}

	@Override
	public Cliente cadastrar(Cliente cliente) {
		return this.clienteRepo.save(cliente);
	}

	@Override
	public Cliente atualizar(Cliente cliente) {
		return this.clienteRepo.save(cliente);
	}

	@Override
	public void deletar(Long id) {
		this.clienteRepo.deleteById(id);
	}
}
