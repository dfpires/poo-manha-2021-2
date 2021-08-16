package lista1;
public class Aluno {
    // variáveis públicas
    // Java é uma linguagem tipada
    public int nroAluno, idade; 
    public String nome;
    public float p1, p2;

    // método construtor sem parâmetros
    public Aluno(){ // Aluno objeto1 = new Aluno();

    }
    // método construtor com parâmetros
    // Aluno objeto2 = new Aluno(1234, 19, "Keflen", 8, 7)
    public Aluno(int nroAluno, int idade, String nome, float p1, float p2){
        // this representa o objeto que chama o método
        this.nroAluno = nroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    // método retorna a média final do aluno (float)
    // objeto1.notaFinal()
    // objeto2.notaFinal()
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }

    // método retorna os dados do aluno: junção de int , float e String
    // objeto1.dadosAluno()
    // objeto2.dadosAluno()
    public String dadosAluno(){
        return "Número do aluno " + this.nroAluno + " Nome: " + this.nome + " Idade: " + this.idade + " média de aluno " + this.notaFinal();
    }

    public String passou(){
        if (this.notaFinal() >= 6){
            return "aprovado";
        }
        else {
            return "reprovado";
        }
        // operador ternário
        // return (this.notaFinal() >= 6) ? "aprovado" : "reprovado";
    }
}
