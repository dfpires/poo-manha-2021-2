package lista3.academico;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    // associação com ArrayList
    private ArrayList<Aluno> alunos; // vetor de objetos da classe Aluno

    public Disciplina() {
        setAlunos(new ArrayList<Aluno>()); // aloca espaço na memória para o vetor
    }
    public Disciplina(String nome, int cargaHoraria, ArrayList<Aluno> alunos) {
        this.setNome(nome);
        this.setCargaHoraria(cargaHoraria);
        this.setAlunos(alunos);
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    public boolean removeAluno(Aluno aluno){
        return this.alunos.remove(aluno); // retorna true se conseguiu remover o aluno
    }

    public String toString(){
        return "Nome: " + this.nome + " Carga horário " + this.cargaHoraria + " \n Alunos: " + this.alunos.toString();
    }
}
