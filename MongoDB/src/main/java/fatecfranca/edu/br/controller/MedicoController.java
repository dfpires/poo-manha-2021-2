package fatecfranca.edu.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatecfranca.edu.br.model.Medico;
import fatecfranca.edu.br.model.repositories.MedicoRepository;

@RestController // classe fica responsável por responder as requisições REST
@RequestMapping("/medico")
public class MedicoController {

	// injeção de dependência -> executar métodos por um objeto sem instanciá-lo
	@Autowired
	MedicoRepository injecao;
	
	@GetMapping
	public List<Medico> get(){
		return injecao.findAll();
	}
	
	@PostMapping
	public String add(@RequestBody Medico medico) { // médico sem id
		injecao.save(medico);
		return "Médico inserido com sucesso";
	}
	
	@DeleteMapping("/{id}")
	public String remove(@PathVariable String id) {
		injecao.deleteById(id);
		return "Médico removido com sucesso";
	}
	
	@PutMapping
	public String update(@RequestBody Medico medico) { // médico tem id
		injecao.save(medico);
		return "Médico atualizado com sucesso";
	}
	
}
