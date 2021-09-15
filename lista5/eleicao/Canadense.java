package lista5.eleicao;

public class Canadense implements IEleitor{

    @Override
    public void tirarTitulo() {
        System.out.println("Canadense tirando título de eleitor");
        
    }

    @Override
    public void votar() {
        System.out.println("Canadense votando");
        
    }
    
}
