package lista3.redesocial;
import java.util.Date;
public class Testa {
    
    public static void main(String args[]){

        RedeSocial rs1 = new RedeSocial(100, "Facebook", "http://www.facebook.com");

        Usuario usr1 = new Usuario(10, "abcd@email.com", "123");

        Publicacao pbc1 = new Publicacao(1, new Date(), 8, rs1, usr1);

        System.out.println(pbc1.toString());
    }
}
