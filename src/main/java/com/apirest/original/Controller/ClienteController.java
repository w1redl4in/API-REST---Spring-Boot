package com.apirest.original.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.original.Models.Cliente;
import com.apirest.original.Services.ClienteService;

@RestController
@RequestMapping(path = "/api/v1/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteServ;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> listarTodos() {
		return ResponseEntity.ok(this.clienteServ.listarTodos());
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Cliente> listarPorId(@PathVariable(name = "id") Long id) {
		return ResponseEntity.ok(this.clienteServ.listarPorId(id));
	}
	
	@PostMapping
	public ResponseEntity<Cliente> cadastrar(@RequestBody Cliente cliente) {
		return ResponseEntity.ok(this.clienteServ.cadastrar(cliente));
	}
	
	@PutMapping(name = "/{id}")
	public ResponseEntity<Cliente> atualizar(@PathVariable(name = "id") Long id, @RequestBody Cliente cliente) {
		cliente.setId(id);
		return ResponseEntity.ok(this.clienteServ.atualizar(cliente));
	}
	
	@DeleteMapping(name = "/{id}")
	public ResponseEntity<Integer> deletar(@PathVariable(name = "id") Long id) {
		this.clienteServ.deletar(id);
		return ResponseEntity.ok(1);
	}
	
}
