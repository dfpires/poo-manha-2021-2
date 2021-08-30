package lista3.ecommerce;
import java.util.Date;
import java.util.ArrayList;

public class Carrinho {
    private int codigo;
    private float valor;
    private String entrega;
    private String formaPagto;
    private Date data;
    // associação com ArrayList
    // o que vai mudar com a composição - relacionado a agregação
    private ArrayList<ItemCarrinho> itens;
    public Carrinho() {
    }
    public Carrinho(int codigo, float valor, String entrega, String formaPagto, Date data,
    ArrayList<ItemCarrinho> itens) {
        this.codigo = codigo;
        this.valor = valor;
        this.entrega = entrega;
        this.formaPagto = formaPagto;
        this.data = data;
        this.itens = itens;
    }
    public int getCodigo() {
        return codigo;
    }
    public ArrayList<ItemCarrinho> getItens() {
        return itens;
    }
    public void setItens(ArrayList<ItemCarrinho> itens) {
        this.itens = itens;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getFormaPagto() {
        return formaPagto;
    }
    public void setFormaPagto(String formaPagto) {
        this.formaPagto = formaPagto;
    }
    public String getEntrega() {
        return entrega;
    }
    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
}
