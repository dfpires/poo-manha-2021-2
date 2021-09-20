package lista5.eleicao;

public class Canadense implements IEleitor, ICidadao{
    @Override
    public void tirarTitulo() {
        System.out.println("Canadense tirando título de eleitor");
    }
    @Override
    public void votar() {
        System.out.println("Canadense votando");
    }    @Override
    public void tirarIdentidade() {
        System.out.println("Canadense tirando identidade");   
    }
    @Override
    public void pagaIr() {
        System.out.println("Canadense pagando IR");   
    }
}
