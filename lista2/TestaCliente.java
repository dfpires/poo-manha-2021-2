package lista2;

public class TestaCliente {
    
    public static void main(String args[]){

        // teste feliz
        Cliente obj1 = new Cliente("674532-6", "8246-9", "Henry", 1000);
        obj1.realizarDeposito(500);
        obj1.realizarSaque(800);

        System.out.println(obj1.toString());

        // teste triste
        Cliente obj2 = new Cliente("67453-26", "82461-9", "Henry", -400);
    }
}
