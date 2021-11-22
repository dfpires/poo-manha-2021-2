package fatecfranca.edu.br.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="pagamentoCartao")
public class PagamentoCartao extends Pagamento{

	@Column(name="bandeira")
	private String bandeira;

	public PagamentoCartao() {
		super();
	}
	public PagamentoCartao(String bandeira, float valor, Date data) {
		super(valor, data);
		this.bandeira = bandeira;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	
	
}
