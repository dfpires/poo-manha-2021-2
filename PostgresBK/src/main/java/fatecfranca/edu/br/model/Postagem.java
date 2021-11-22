package fatecfranca.edu.br.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="postagem")
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String texto;
	private String autor;
	private int qtdeLikes;
	
	// vamos associar a classe Postagem à classe Comentário
	// 1 postagem para vários comentários
	// CascadeType.ALL -> a inserção de um post insere seus comentários
	@OneToMany(cascade = CascadeType.ALL)
	// dentro do Array haverá comentários com chave estrangeira id_post
	@JoinColumn(name="id_postagem", referencedColumnName = "id")
	private List<Comentario> comentarios = new ArrayList<>();

	public Postagem() {
		
	}
	public Postagem(Long id, String texto, String autor, int qtdeLikes, List<Comentario> comentarios) {
		super();
		this.id = id;
		this.texto = texto;
		this.autor = autor;
		this.qtdeLikes = qtdeLikes;
		this.comentarios = comentarios;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQtdeLikes() {
		return qtdeLikes;
	}

	public void setQtdeLikes(int qtdeLikes) {
		this.qtdeLikes = qtdeLikes;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	
	
}
