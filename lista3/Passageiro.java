package lista3;

public class Passageiro {
    private String nome;
    private String cpf;
    public Passageiro(){
    }
    public Passageiro(String nome, String cpf){
        this.setCpf(cpf);
        this.setNome(nome);
    }
    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public final void setNome(String nome) {
        this.nome = nome;
    }
    public String toString(){
        return "CPF: " + this.cpf + " Nome: " + this.nome;
    }
    
}