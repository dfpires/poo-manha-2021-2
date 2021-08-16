package lista1;
// Criar classe - abstrato - genérico
public class Carro {
    // declaração das propriedades / atributos / variáveis
    // Java é tipado -> 2 tipos de variáveis
    // tipo primitivo -> int, float, double, boolean
    // tipo de classe -> Integer, Float, Double, Boolean, String
    int ano; // ano do carro
    float velocidade; // velocidade do carro
    boolean motor; // motor do carro (false é desligado e true ligado)
    String modelo; // modelo do carro

    // criar operações / ações / métodos

    // método construtor -> inicializar as variáveis
    public Carro(){
        
    }
    public Carro(int ano, String modelo, boolean motor, float velocidade){
        this.ano = ano;
        this.modelo = modelo;
        this.motor = motor;
        this.velocidade = velocidade;
    }

    // this representa o objeto que chama o método
    // this representa o obj1 e o obj2
    public void mostra(){
        System.out.println("ano: " + this.ano + " modelo: " + this.modelo + " motor: " + this.motor + " velocidade: " + this.velocidade);
    }

    // desligar o carro
    public void desligar(){
        this.motor = false;
        this.velocidade = 0;
    }

    public void acelerar(float x){
        if (!this.motor){ // ! é a negação -> caso não esteja ligado, ligue
            this.motor = true;
        }
        this.velocidade = this.velocidade + x;
    }
}