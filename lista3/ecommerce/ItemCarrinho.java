package lista3.ecommerce;

public class ItemCarrinho {
    private int codigo;
    private String descricao;
    private int qtde;
    private float preco;

    public ItemCarrinho() {
    }
    public ItemCarrinho(int codigo, String descricao, int qtde, float preco) {
        this.setCodigo(codigo);
        this.setDescricao(descricao);
        this.setQtde(qtde);
        this.setPreco(preco);
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public int getQtde() {
        return qtde;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String toString(){
        return "Código: " + this.codigo + " Descrição: " + this.descricao + " Qtde: " + this.qtde + " Preço " + this.preco;
    }
    
}
