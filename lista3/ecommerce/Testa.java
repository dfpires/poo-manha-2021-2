package lista3.ecommerce;

import java.util.Date;

public class Testa {
    
    public static void main(String args[]){

        // cria um carrinho e adiciona 3 itens ao carrinho, mostra o conteúdo do carrinho
        Carrinho car1 = new Carrinho(10, 500, "Sedex", "Cartão de Crédito", new Date());

        // composição
        car1.addItemCarrinho(1, "Álcool em gel", 5, 8.30f);
        car1.addItemCarrinho(2, "Máscara", 30, 3.50f);
        car1.addItemCarrinho(3, "Perfume", 1, 230.0f);

        System.out.println(car1.toString());

        car1.removeItemCarrinho(2);

        System.out.println(car1.toString());
    }
}
