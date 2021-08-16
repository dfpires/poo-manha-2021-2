package lista1;
public class TestaProduto {
    
    public static void main(String args[]){
        // instanciar os objetos
        Produto obj1 = new Produto(123, 30, 3, "Máscara"); // chama o construtor
        obj1.comprar(10);
        obj1.subir(0.3f);
        System.out.println(obj1.mostra());

        Produto obj2 = new Produto(456, 100, 1, "Álcool em gel");// chama o construtor
        obj2.vender(5);
        obj2.descer(0.1f);
        System.out.println(obj2.mostra());
    }
}
