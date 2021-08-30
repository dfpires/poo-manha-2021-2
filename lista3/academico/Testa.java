package lista3.academico;

public class Testa {
    
    public static void main(String args[]){

        Aluno al1 = new Aluno(111, "Keflen", 19);
        Aluno al2 = new Aluno(222, "Tulio", 20);
        Aluno al3 = new Aluno(333, "Donizete", 21);
    
        Disciplina di1 = new Disciplina();
        di1.setNome("POO");
        di1.setCargaHoraria(80);
        di1.addAluno(al1);
        di1.addAluno(al2);
        di1.addAluno(al3);
        System.out.println(di1.toString());
    }
}
