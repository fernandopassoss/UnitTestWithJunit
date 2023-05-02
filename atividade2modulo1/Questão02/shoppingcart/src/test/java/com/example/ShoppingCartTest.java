package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShoppingCartTest {

    

    @Test
    void testeCarrinhoVazio(){
        ShoppingCart shoppingCart = new ShoppingCart();
        assertEquals(0, shoppingCart.getItemCount());
    }

    @Test
    void testeCarrinhoQuandoEsvaziado(){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.empty();
        assertEquals(0, shoppingCart.getBalance());
    }

    @Test
    void testeIncrementoCarrinho(){
        ShoppingCart shoppingCart = new ShoppingCart();
        assertEquals(0, shoppingCart.getBalance());
        Product sabonete = new Product("sabonete", 4.5);
        shoppingCart.addItem(sabonete);
        assertEquals(1, shoppingCart.getItemCount());
        
    }
    
    @Test
    void testeValorTotalCarrinho(){
        ShoppingCart shoppingCart = new ShoppingCart();
        Product sabonete = new Product("sabonete", 4.5);   
        shoppingCart.addItem(sabonete);
        assertEquals(4.5, shoppingCart.getBalance());  
        Product arroz = new Product("arroz", 5.2);
        shoppingCart.addItem(arroz);
        assertEquals(9.7, shoppingCart.getBalance());
     
    }

    @Test
    void testeRemoverItem() throws ProductNotFoundException{
        ShoppingCart shoppingCart = new ShoppingCart();
        Product sabonete = new Product("sabonete", 4.5);   
        shoppingCart.addItem(sabonete);
        assertEquals(1, shoppingCart.getItemCount());  
        shoppingCart.removeItem(sabonete);
        assertEquals(0, shoppingCart.getItemCount()); 
             
    }  
    @Test
    void testeRemoverItemQueNaoEstaNoCarrinho() throws ProductNotFoundException{
        ShoppingCart shoppingCart = new ShoppingCart();
        Product mamao = new Product("mamao", 8.3);

        try{
            shoppingCart.removeItem(mamao);
        }catch(ProductNotFoundException e){
            assertEquals("com.example.ProductNotFoundException", e.getClass().getName());
        }
        

    }
}
