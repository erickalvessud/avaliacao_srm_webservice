package br.com.srm.emprestimows.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.srm.emprestimows.model.Cliente;
import br.com.srm.emprestimows.repository.ClienteRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Cliente buscaPorId(@PathVariable("id") Long id) {
		Cliente cliente = this.clienteRepository.findOne(id);
		return cliente;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Cliente> listar() {
		Iterable<Cliente> clientes = clienteRepository.findAll();
		System.out.println(clientes);
		return clientes;
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Cliente cadastrar(@RequestBody Cliente cliente) {
		this.clienteRepository.save(cliente);
		return cliente;
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Cliente atualizar(@RequestBody Cliente cliente) {
		this.clienteRepository.save(cliente);
		return cliente;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deletar(@PathVariable("id") Long id) {
		Cliente cliente = this.clienteRepository.findOne(id);
		if(cliente == null) {
			return;
		}
		this.clienteRepository.delete(cliente);
	}
}
