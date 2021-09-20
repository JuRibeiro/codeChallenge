package br.com.julianaribeiro.springbootmysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.julianaribeiro.springbootmysql.model.ParceiroModel;
import br.com.julianaribeiro.springbootmysql.repository.ParceiroRepository;

@RestController
@RequestMapping ("/id")
@CrossOrigin ("*")
public class ParceiroController {
	
	@Autowired
	private ParceiroRepository repository;
	
	@GetMapping ("/{id}")
	public ResponseEntity<ParceiroModel> getById (@PathVariable long id)
	{
		return repository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}

}
