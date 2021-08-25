package lista3.viagem;
public class Voo {
    private String origem, destino;
    private int codigo;
    public Voo(){    }
    public Voo(String origem, String destino, int codigo) {
        this.setOrigem(origem);
        this.setDestino(destino);
        this.setCodigo(codigo);
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String toString(){
        return "Código: " + this.codigo + " Origem: " + this.origem + " Destino: " + this.destino;
    }
    
    
    
    
}
