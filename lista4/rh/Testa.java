package lista4.rh;

public class Testa {
    
    public static void main(String args[]){

        // percebemos que a classe Funcionário não foi instanciada - new Funcionario
        // Funcionario func1 = new Funcionario(); -> não podemos fazer

        // pois não se cria um funcionário, mas sim um assistente, um gerente ou um diretor
        Assistente as1 = new Assistente("Fulano", "123", 1000, 4);
        System.out.println(as1.toString());

        Gerente ge1 = new Gerente("Beltrano", "456", 2000, 500);
        System.out.println(ge1.toString());

        Diretor di1 = new Diretor("Ciclano", "789", 3000, "Compass");
        System.out.println(di1.toString());
        
    }
}
