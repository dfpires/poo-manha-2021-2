package lista2;
public class TestaProduto {
    
    public static void main(String args[]){
        // instanciar os objetos
        Produto obj1 = new Produto(123, 30, 3, "Máscara"); // chama o construtor
        obj1.comprar(10);
        obj1.subir(0.3f);
        System.out.println(obj1.mostra());
        obj1.setPreco(-10); // variáveis não encapsuladas (escondida)
        System.out.println("Preço de obj1: " + obj1.getPreco());

        Produto obj2 = new Produto(456, 100, 1, "Álcool em gel");// chama o construtor
        obj2.vender(5);
        obj2.descer(0.1f);
        System.out.println(obj2.mostra());
        obj2.setQtde(-45); // variáveis não encapsuladas (escondida)
        System.out.println("Qtde de obj2: " + obj2.getQtde());

        // acabamos de perder o encapsulamento
        Produto obj3 = new Produto(-3, -5, -10, "Folha sulfite");
        System.out.println("Valores de obj3: " + obj3.mostra());
    }
}
