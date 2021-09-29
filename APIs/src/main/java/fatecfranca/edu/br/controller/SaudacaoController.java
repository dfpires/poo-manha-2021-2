package fatecfranca.edu.br.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// esta classe será a responsável por receber as requisições das APIs Restful
// vamos utilizar um decorator
@RestController
public class SaudacaoController {

	// vamos construir métodos GET para cada rota diferente
	// rota 1: /saudacao/dia
	// rota 2: /saudacao/tarde
	// rota 3: /saudacao/noite
	
	@GetMapping("/saudacao/dia")
	public String enviaSaudacaoDia() {
		return "Bom dia";
	}
	@GetMapping("/saudacao/tarde")
	public String enviaSaudacaoTarde() {
		return "Boa tarde";
	}
	@GetMapping("/saudacao/noite")
	public String enviaSaudacaoNoite() {
		return "Boa noite";
	}	
	
	@GetMapping("/saudacao/{nome}")
	public String enviaSaudacaoNome(@PathVariable String nome) {
		return " Bom dia " + nome;
	}
	
	// método post -> inserir
	@PostMapping("/saudacao/{mensagem}")
	public String insereMensagem(@PathVariable String mensagem) {
		return "Mensagem " + mensagem + " inserida com sucesso";
	}
	
	// método delete -> remover
	@DeleteMapping("/saudacao/{mensagem}")
	public String removeMensagem(@PathVariable String mensagem) {
		return "Mensagem " + mensagem + " removida com sucesso";
	}
	
	// método put -> atualizar
	@PutMapping("/saudacao/{mensagem}")
	public String atualizaMensagem(@PathVariable String mensagem) {
		return "Mensagem " + mensagem + " atualizada com sucesso";
	}
	
}
