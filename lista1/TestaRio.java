package lista1;
public class TestaRio {
    
    public static void main(String args[]){

        Rio obj1 = new Rio("Amazonas", 0.87f, false);

        obj1.sujar();

        obj1.ensolarar(0.31f);

        System.out.println(obj1.mostra());

        Rio obj2 = new Rio("Canoas", 0.37f, true);

        obj2.limpar();
        
        obj2.chover(1);
        
        System.out.println(obj2.mostra());
    }
}
