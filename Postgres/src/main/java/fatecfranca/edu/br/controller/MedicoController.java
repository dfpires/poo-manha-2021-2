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


@RestController
@RequestMapping("/medico")
public class MedicoController {

	@Autowired
	MedicoRepository injecao;
	
	@GetMapping
	public List<Medico> get(){
		return injecao.findAll();
	}
	
	@PostMapping
	public String add(@RequestBody Medico medico) {
		injecao.save(medico);
		return "medico inserido com sucesso";
	}
	
	@DeleteMapping("/{id}")
	public String remove(@PathVariable Long id) {
		injecao.deleteById(id);
		return "medico removido com sucesso";
	}
	
	@PutMapping
	public String put(@RequestBody Medico medico) {
		injecao.save(medico); // se este paciente tiver id, e ele existir no banco, atualiza
		// se este paciente não tiver id, ele insere no banco
		return "medico atualizado com sucesso";
	}
}
