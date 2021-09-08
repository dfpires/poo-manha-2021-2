package lista4;

public class Assistente extends Funcionario{
     // o extends faz com que assistente tenha nome, cpf e salário do pai
    // o extends faz com que assistente tenha getters, setters e toString do pai
    private float horaExtra;

    public Assistente(String nome, String cpf, float salario, float horaExtra) {
        super(nome, cpf, salario);  // chama construtor da superclasse para reutilização de código 
        this.setHoraExtra(horaExtra);
    }

    public Assistente() {
        super(); // chama construtor da superclasse para reutilização de código 
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    // o método toString() herdado vai servir para a classe Assistente?
    // Resposta: não, então nós iremos anular o método herdado
    @Override
    public String toString(){
        return super.toString() + " Hora-Extra: " + this.horaExtra;
    }    
}
