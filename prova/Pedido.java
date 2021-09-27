package prova;
import java.util.Date;
public class Pedido {
    private int codigo;
    private Date data;
    // associações
    private Cliente cliente;
    private Unidade unidade;

    public Pedido() {
    }
    public Pedido(int codigo, Date data, Cliente cliente, Unidade unidade) {
        this.setCodigo(codigo);
        this.setData(data);
        this.setCliente(cliente);
        this.setUnidade(unidade);
    }
    public int getCodigo() {
        return codigo;
    }
    public Unidade getUnidade() {
        return unidade;
    }
    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString(){
        return "Código " + this.codigo + " Data: " + this.data + 
        " Cliente: " + this.cliente.toString() + " Unidade: " + this.unidade.toString();
    }
}
