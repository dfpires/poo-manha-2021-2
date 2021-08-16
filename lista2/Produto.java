package lista2;
public class Produto {
    
    // variáveis privadas, encapsuladas ou escondidas
    private int id, qtde; // tipos primitivos
    private float preco; // tipos primitivos
    private String descricao; // tipo de uma classe

    // método construtor
    public Produto(){

    }
    // os parâmetros são os valores do usuário
    public Produto(int id, int qtde, float preco, String descricao){
        // vamos atribuir os valores ao objeto que chamou o método
        this.setId(id);
        this.setQtde(qtde);
        this.setPreco(preco);
        this.setDescricao(descricao);
    }

    // setters
    public void setId(int id){
        if (id >= 0){
            this.id = id;
        }
        else {
            System.out.println("Id inválido");
        }
    }
    public void setQtde(int qtde){
        if (qtde >=0){
            this.qtde = qtde;
        }
        else {
            System.out.println("Qtde inválida");
        }
    }
    public void setPreco(float preco){
        if (preco >= 0){
            this.preco = preco;
        }
        else {
            System.out.println("Preço inválido");
        }  
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    // getters
    public int getId(){
        return this.id;
    }
    public int getQtde(){
        return this.qtde;
    }
    public float getPreco(){
        return this.preco;
    }
    public String getDescricao(){
        return this.descricao;
    }
    
    public void comprar(int x){
        this.qtde += x;
    }

    public void vender(int x){

        this.setQtde(this.qtde - x); //  verifica se tem em estoque

    }

    public void subir(float x){
        this.preco += x;
    }

    public void descer(float x){

        this.setPreco(this.preco - x);// verificar se o valor não vai ficar negativo

    }

    public String mostra(){
        return "Id: " + this.id + " Descrição: " + this.descricao + " Qtde: " + this.qtde + " Preço: " + this.preco;
    }
}
