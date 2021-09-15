package lista4.rh;

public class Diretor extends Funcionario{
    // o extends faz com que diretor tenha nome, cpf e salário do pai
    // o extends faz com que diretor tenha getters, setters e toString do pai
    private String carro;
    public Diretor(){
        super();
    }
    public Diretor(String nome, String cpf, float salario, String carro) {
        super(nome, cpf, salario);
        this.setCarro(carro);
    }
    public String getCarro() {
        return carro;
    }
    public void setCarro(String carro) {
        this.carro = carro;
    }
   @Override
   public String toString(){
       return super.toString() + " Carro: " + this.carro;
   }

   @Override
   public void receberSalario(){
       // salário + 30 reais por hora-extra
       System.out.println(" Salário total: " + this.salario + " 5% do valor do carro " + this.carro + "que tem");
   }
}
