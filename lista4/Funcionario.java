package lista4;

// classe pai 
// a única novidade é o protected das variáveis
public class Funcionario {
    protected String nome;
    protected String cpf;
    protected float salario;
    public Funcionario() {
    }
    public Funcionario(String nome, String cpf, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    // getters
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public float getSalario(){
        return this.salario;
    }
    // setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }

    public String toString(){
        return "Nome: " + this.nome + " CPF: " + this.cpf + " Salário: " + this.salario;
    }
}
