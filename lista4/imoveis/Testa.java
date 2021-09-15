package lista4.imoveis;

public class Testa {
    
    public static void exemploPolimorfismo(Moradia camaleao){
        System.out.println(camaleao.toString()); // polimorfismo
        camaleao.calcularPreco(); // polimorfismo
    }
    public static void main(String args[]){

        Casa ca = new Casa("Rua Chile, 200", "Franca", 100, 30, true);
        exemploPolimorfismo(ca);

        Apto ap = new Apto("Rua Acre, 3", "Franca", 80, 45, 4);
        exemploPolimorfismo(ap);

    }
}
