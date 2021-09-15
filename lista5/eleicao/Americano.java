package lista5.eleicao;

public class Americano implements IEleitor{

    @Override
    public void tirarTitulo() {
        System.out.println("Americano tirando título de eleitor");
        
    }

    @Override
    public void votar() {
        System.out.println("Americando votando");
    }
    
    
}
