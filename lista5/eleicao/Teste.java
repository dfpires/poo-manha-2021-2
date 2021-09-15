package lista5.eleicao;

public class Teste {
    
    public static void exemploPolimorfismo(IEleitor camaleao){
        camaleao.tirarTitulo();
        camaleao.votar();
    } 
    public static void main(String args[]){

        Brasileiro br = new Brasileiro();
        exemploPolimorfismo(br);

        Americano us = new Americano();
        exemploPolimorfismo(us);

        Canadense ca = new Canadense();
        exemploPolimorfismo(ca);
    }
}
