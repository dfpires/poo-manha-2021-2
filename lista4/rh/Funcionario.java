package lista4.rh;

// classe pai 
// a única novidade é o protected das variáveis
// a nossa classe será abstrata -> não pode ser instanciada
public abstract class Funcionario {
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
    // não conseguimos calcular o salário aqui, mas sim somente nas filhas
    // aliás, nas filhas somos obrigados a implementar este método
    public abstract void receberSalario();
}
