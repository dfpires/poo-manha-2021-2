package lista1;
// criação da classe
public class Rio {
    // variáveis
    public String nome;
    public float nivel;
    public boolean poluido; //(true -> está poluído; false -> não está poluído)

    // criação do método construtor - tem o mesmo nome da classe
    public Rio(){ // Rio obj1 = new Rio();

    }
    // criação do método construtor - tem o mesmo nome da classe
    // Rio obj2 = new Rio("Tapajós", 0.30f, false);
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    // método que aumenta o nível do rio
    // obj1.chover(2)
    // obj2.chover(3)
    public void chover(float x){
        this.nivel = this.nivel + x;
    }
    // diminui o nível
    public void ensolarar(float x){
        this.nivel = this.nivel - x;
    }
    // método que suja o rio
    public void sujar(){
        this.poluido = true;
    }
     // método que limpa o rio
     public void limpar(){
        this.poluido = false;
    }
    public String mostra(){
        return String.format("Nome do rio: %s Nível do rio %.2f e se está poluido %b", this.nome, this.nivel, this.poluido);
    }
}
