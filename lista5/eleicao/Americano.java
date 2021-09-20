package lista5.eleicao;

public class Americano implements IEleitor, ICidadao{

    @Override
    public void tirarTitulo() {
        System.out.println("Americano tirando título de eleitor");
        
    }

    @Override
    public void votar() {
        System.out.println("Americando votando");
    }

    @Override
    public void tirarIdentidade() {
        System.out.println("Americando tirando identidade");
        
    }

    @Override
    public void pagaIr() {
        System.out.println("Americando pagando IR");
        
    }
    
    
}
