package lista4.rh;

public class Gerente extends Funcionario{
    // o extends faz com que gerente tenha nome, cpf e salário do pai
    // o extends faz com que gerente tenha getters, setters e toString do pai
    private float bonus;
    public Gerente() {
        super(); // chama construtor da superclasse para reutilização de código
    }
  
    public Gerente(String nome, String cpf, float salario, float bonus) {
        super(nome, cpf, salario); // chama construtor da superclasse para reutilização de código
        this.setBonus(bonus);
    }

    public float getBonus() {
        return bonus;
    }
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    @Override
    public String toString(){
        return super.toString() + " bônus " + this.bonus;
    }
    @Override
    public void receberSalario(){
        // salário + bônus é um percentual do salário
        float aux = this.salario + (this.salario*this.bonus/100);
        System.out.println(" Salário total: " + aux);
    }
}
