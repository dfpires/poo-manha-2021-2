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
        // aloca espaço na memória para o ArrayList
        this.setItens(new ArrayList<ItemCarrinho>());
    }
    public Carrinho(int codigo, float valor, String entrega, String formaPagto, Date data) {
        this.codigo = codigo;
        this.valor = valor;
        this.entrega = entrega;
        this.formaPagto = formaPagto;
        this.data = data;
         // aloca espaço na memória para o ArrayList
         this.setItens(new ArrayList<ItemCarrinho>());
    }
    public int getCodigo() {
        return codigo;
    }
    public ArrayList<ItemCarrinho> getItens() {
        return itens;
    }
    //impossibilita de se atribuir um vetor de itens do carrinho fora da classe
    private void setItens(ArrayList<ItemCarrinho> itens) {
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

    public void addItemCarrinho(int codigo, String descricao, int qtde, float preco){
        // boa diferença entre agregação e composição
        this.itens.add(new ItemCarrinho(codigo, descricao, qtde, preco));
    }
    
    public boolean removeItemCarrinho(int codigo, String descricao, int qtde, float preco){
        // retorna se conseguiu remover (true ou false)
        return this.itens.remove(new ItemCarrinho(codigo, descricao, qtde, preco));
    }

    public String toString(){
        return "Código " + this.codigo + " Valor: " + this.valor + " forma de entrega: " + this.entrega + " forma de pagamento: " + this.formaPagto + " Data: " + this.data + " \n Itens: " + this.itens.toString();
    }
}
