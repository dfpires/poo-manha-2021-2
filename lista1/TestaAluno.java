package lista1;
public class TestaAluno {
    
    public static void main(String args[]){

        // instância da classe Aluno
        Aluno objeto1 = new Aluno(123, 19, "Keflen", 8, 9);
        System.out.println(objeto1.dadosAluno());
        System.out.println(objeto1.passou());

        Aluno objeto2 = new Aluno(456, 20, "João Pedro", 7, 2);
        System.out.println(objeto2.dadosAluno());
        System.out.println(objeto2.passou());
    }
}
