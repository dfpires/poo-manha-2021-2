package lista3;
import java.util.Date;

public class TestaReserva {
    
    public static void main(String args[]){
        // cria passageiro
        Passageiro pas1 = new Passageiro("Zé", "123");
        // cria voo
        Voo vo1 = new Voo("SP", "RJ", 111);
        // cria reserva
        // cria a data atual - new Date()
        Reserva re1 = new Reserva(999, new Date(), pas1, vo1);

        System.out.print(re1.toString());
    }
}
