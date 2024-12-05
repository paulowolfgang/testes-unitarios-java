package br.dev.paulowolfgang.exemplos.loja_virtual.exemplo02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author Paulo Silva
 */
public class MaiorPrecoTest {
    
    @Test
    public void deveRetornarZeroSeCarrinhoVazio()
    {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        MaiorPreco algoritmo = new MaiorPreco();
        
        double valor = algoritmo.encontra(carrinho);
        
        Assertions.assertEquals(0.0, valor);
    }
    
    @Test
    public void deveRetornarValorDoItemSeCarrinhoCom1Elemento()
    {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Item("Geladeira", 1, 900.0));
        
        MaiorPreco algoritmo = new MaiorPreco();
        double valor = algoritmo.encontra(carrinho);
        
        Assertions.assertEquals(900.0, valor);
    }
    
    @Test
    public void deveRetornarMaiorValorSeCarrinhoConteMuitosElementos()
    {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Item("Geladeira", 1, 900.0));
        carrinho.adiciona(new Item("Fogão", 1, 1500.0));
        carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));
        
        MaiorPreco algoritmo = new MaiorPreco();
        double valor = algoritmo.encontra(carrinho);
        
        Assertions.assertEquals(1500.0, valor);
    }
}
