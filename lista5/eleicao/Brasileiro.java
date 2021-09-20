package lista5.eleicao;

public class Brasileiro implements IEleitor, ICidadao{
    @Override
    public void tirarTitulo() {
        System.out.println("Brasileiro tirando título de eleitor");
    }
    @Override
    public void votar() {
        System.out.println("Brasileiro votando");
    }
    @Override
    public void tirarIdentidade() {
        System.out.println("Brasileiro tirando identifica");
    }
    @Override
    public void pagaIr() {
        System.out.println("Brasileiro pagando IR");
        
    }
}
