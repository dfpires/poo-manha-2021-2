package lista4.imoveis;

public class Apto extends Moradia{
    // variáveis
    private int nro;
    private int andar;
    // construtores
    public Apto() {
        super(); // reutilização do construtor da superclasse
    }
    public Apto(String endereco, String cidade, float tamanho, int nro, int andar) {
        super(endereco, cidade, tamanho); // reutilização do construtor da superclasse
        this.setNro(nro); 
        this.setAndar(andar);
    }
    // getters e setters
    public int getAndar() {
        return andar;
    }
    public void setAndar(int andar) {
        this.andar = andar;
    }
    public int getNro() {
        return nro;
    }
    public void setNro(int nro) {
        this.nro = nro;
    }
    // toString
    public String toString(){
        return super.toString() + " Nro: " + this.nro + " Andar: " + this.andar;
    }
    @Override
    public void calcularPreco() {
        float aux = (this.tamanho * 800);
        if (this.nro % 2 == 0){
            aux = aux + 200;
        } 
        else {
            aux = aux + 300;
        }
        if (this.andar >= 3){
            aux = aux + 2000;
        }
        System.out.println("O preço do apto é " + aux);
    }
    
}
