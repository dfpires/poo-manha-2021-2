package lista4.imoveis;

public class Casa extends Moradia{
    // variáveis
    private float tamQuintal;
    private boolean piscina; // true se tiver piscina e false caso não tenha
    // construtores
    public Casa(){
        super(); // reutilização do construtor da superclasse
    }
    public Casa(String endereco, String cidade, float tamanho, float tamQuintal, boolean piscina) {
        super(endereco, cidade, tamanho);// reutilização do construtor da superclasse
        this.setTamQuintal(tamQuintal);
        this.setPiscina(piscina);
    }
    // getters e setters
    public boolean isPiscina() {
        return piscina;
    }
    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }
    public float getTamQuintal() {
        return tamQuintal;
    }
    public void setTamQuintal(float tamQuintal) {
        this.tamQuintal = tamQuintal;
    }
    // toString()
    @Override // anulando método da superclasse
    public String toString(){
        return super.toString() + " tem pisicina: " + this.piscina + "tam quintal: " + this.tamQuintal;
    }
    @Override // anulando método da superclasse
    public void calcularPreco() {
        float aux = (this.tamanho * 500) + this.tamQuintal * 100;
        if (this.piscina){
            aux = aux + 1000;
        }
        System.out.println("Preço da casa: " + aux);
    }
    
}
