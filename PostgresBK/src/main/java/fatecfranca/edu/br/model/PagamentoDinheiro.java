package fatecfranca.edu.br.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="pagamentoDinheiro")
public class PagamentoDinheiro extends Pagamento{

	@Column(name="desconto")
	private float desconto;
	
	public PagamentoDinheiro() {
		super();
	}
	public PagamentoDinheiro(float desconto, float valor, Date data) {
		super(valor, data);
		this.desconto = desconto;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	
	
}
