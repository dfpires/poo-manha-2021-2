package fatecfranca.edu.br.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="pagamento")
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS )
public abstract class Pagamento {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;
	@Column(name="valor")
	private float valor;
	@Column(name="data")
	private Date data;
	
	public Pagamento() {
		
	}
	public Pagamento(float valor, Date data) {
		this.valor = valor;
		this.data = data;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	
	
	
}
