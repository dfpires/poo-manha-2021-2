package lista2;

public class Aluno {
    private int numeroAluno, idade;
    private String nome;
    private float p1, p2;

    // construtor sem parâmetro
    public Aluno(){ // criamos para não dar erro no caso de: Aluno obj = new Aluno()

    }
    // construtor com parâmetros
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        this.setNumeroAluno(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    final void setP2(float p2) {
        if (p2 >= 0){
            this.p2 = p2;
        }
        else {
            System.out.println("Nota não pode ser negativa");
        }
    }

    final void setP1(float p1) {
        if (p1 >= 0){
            this.p1 = p1;
        }
        else {
            System.out.println("Nota não pode ser negativa");
        }
    }

    final void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else {
            System.out.println("Nome não pode ter comprimento maior que 30");
        }
    }

    final void setIdade(int idade) {
        if (idade >= 0){
            this.idade = idade;
        }
        else {
            System.out.println("Idade não pode ser negativa");
        }
    }

    // não deixa a subclasse (herança) alterar o método
    final void setNumeroAluno(int numeroAluno) {
        // converte inteiro para String
        String aux = String.valueOf(numeroAluno);
        if (aux.length() == 6){
            this.numeroAluno = numeroAluno;
        }
        else {
            System.out.println("Número do aluno deve ter tamanho 6");
        }

    }

    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }

    public String toString(){
        return "Número do aluno: " + this.numeroAluno + " Nome: " + this.nome + " P1: " + this.p1 + " P2: " + this.p2 + " Média: " + this.notaFinal();
    }

}
