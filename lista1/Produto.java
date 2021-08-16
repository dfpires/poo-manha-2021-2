package lista1;
public class Produto {
    
    public int id, qtde; // tipos primitivos
    public float preco; // tipos primitivos
    public String descricao; // tipo de uma classe

    // método construtor
    public Produto(){

    }
    // os parâmetros são os valores do usuário
    public Produto(int id, int qtde, float preco, String descricao){
        // vamos atribuir os valores ao objeto que chamou o método
        this.id = id;
        this.qtde = qtde;
        this.preco = preco;
        this.descricao = descricao;
    }

    public void comprar(int x){
        this.qtde += x;
    }

    public void vender(int x){
        this.qtde -=x;
    }

    public void subir(float x){
        this.preco += x;
    }

    public void descer(float x){
        this.preco -= x;
    }

    public String mostra(){
        return "Id: " + this.id + " Descrição: " + this.descricao + " Qtde: " + this.qtde + " Preço: " + this.preco;
    }
}
