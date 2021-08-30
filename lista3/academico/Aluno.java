package lista3.academico;

public class Aluno {
    private int ra;
    private String nome;
    private int idade;
    public Aluno() {
    }
    public Aluno(int ra, String nome, int idade) {
        this.setRa(ra);
        this.setNome(nome);
        this.setIdade(idade);
    }
    public int getRa() {
        return ra;
    }
    public void setRa(int ra) {
        this.ra = ra;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String toString(){
        return "RA: " + this.ra + " Nome: " + this.nome + " Idade: " + this.idade; 
    }
}
