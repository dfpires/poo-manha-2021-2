package lista4.rh;

public class Testa {
    
    public static void exemploPolimorfismo(Funcionario camaleao){
        System.out.println(camaleao.toString());
        camaleao.receberSalario();
    }
    public static void main(String args[]){

        // percebemos que a classe Funcionário não foi instanciada - new Funcionario
        // Funcionario func1 = new Funcionario(); -> não podemos fazer

        // pois não se cria um funcionário, mas sim um assistente, um gerente ou um diretor
        Assistente as1 = new Assistente("Fulano", "123", 1000, 4);
        exemploPolimorfismo(as1); // camaleao será um assistente

        Gerente ge1 = new Gerente("Beltrano", "456", 2000, 10);
        exemploPolimorfismo(ge1); // camaleao será um gerente

        Diretor di1 = new Diretor("Ciclano", "789", 3000, "Compass");
        exemploPolimorfismo(di1); // camaleao será um diretor
    }
}
