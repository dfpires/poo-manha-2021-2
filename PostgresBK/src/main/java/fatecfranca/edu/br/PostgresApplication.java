package fatecfranca.edu.br;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fatecfranca.edu.br.model.Comentario;
import fatecfranca.edu.br.model.PagamentoCartao;
import fatecfranca.edu.br.model.PagamentoDinheiro;
import fatecfranca.edu.br.model.Postagem;
import fatecfranca.edu.br.model.repositories.PagamentoCartaoRepository;
import fatecfranca.edu.br.model.repositories.PagamentoDinheiroRepository;
import fatecfranca.edu.br.model.repositories.PostagemRepository;

@SpringBootApplication
public class PostgresApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PostgresApplication.class, args);
	}

	// cria objeto de injeção de dependência da classe Postagem
	@Autowired
	PostagemRepository postagem;

	@Autowired
	PagamentoCartaoRepository pc;
	
	@Autowired
	PagamentoDinheiroRepository pd;
	
	@Override
	public void run(String...strings ) throws Exception {
		/*
		// cria uma postagem
		Postagem post = new Postagem();
		post.setAutor("Marcos Pedro");
		post.setTexto("Pessoal, no dia 24 teremos prova de POO");
		post.setQtdeLikes(8);
		
		// cria 2 comentários
		Comentario comment1 = new Comentario();
		comment1.setAutor("Kefflen");
		comment1.setTexto("Obrigado, Marcos, pela informação");
		
		Comentario comment2 = new Comentario();
		comment2.setAutor("Vinicius");
		comment2.setTexto("Vamos estudar bastante");
		
		// adicionar comentário na postagem
		post.getComentarios().add(comment1);
		post.getComentarios().add(comment2);

		// insere a postagem no banco de dados - consequentemente vai inserir os comentários também
		postagem.save(post);
		
		*/
		
		PagamentoCartao pagCartao = new PagamentoCartao("visa", 300, new Date());
		pc.save(pagCartao);
		
		PagamentoDinheiro pagDinheiro = new PagamentoDinheiro(10, 200, new Date());
		pd.save(pagDinheiro);
		
	}
}
