package enade;

public class Boeing757 extends Aviao{

    // método construtor
    public Boeing757(){
        formaPousar = new PousarDia();
        formaVoar = new VoarDia();
    }
    
    @Override
    public void informarDados() {
        System.out.println("Voando e pousando com avião Boeing 757");
        
    }
    
}
