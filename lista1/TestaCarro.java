package lista1;
public class TestaCarro {
    
    // método especial chamado main que recebe como parâmetro um vetor de String
    // o método é público, estático (de classe) e não retorna tipo (void)
    public static void main(String args[]){
        // instanciaremos a classe Carro
        Carro obj1 = new Carro(); // chama método construtor
        obj1.ano = 2019;
        obj1.modelo = "Onix";
        obj1.motor = true;
        obj1.velocidade = 40;
        // instanciaremos a classe Carro
        Carro obj2 = new Carro(2016, "Celta", true, 80); // chama método construtor

        // exibir os valores dos objetos
        obj1.mostra();
        obj2.mostra();

        obj1.desligar();
        obj2.desligar();

        obj1.mostra();
        obj2.mostra();

        obj1.acelerar(40);
        obj2.acelerar(50);

        obj1.mostra();
        obj2.mostra();
    }
}
