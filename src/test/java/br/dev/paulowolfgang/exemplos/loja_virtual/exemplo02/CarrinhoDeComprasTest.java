package br.dev.paulowolfgang.exemplos.loja_virtual.exemplo02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author Paulo Silva
 */
public class CarrinhoDeComprasTest {
    
    private CarrinhoDeCompras carrinho;
    
    @BeforeEach
    public void inicializa()
    {
        this.carrinho = new CarrinhoDeCompras();
    }
    
    @Test
    public void deveRetornarZeroSeCarrinhoVazio()
    {
        Assertions.assertEquals(0.0, carrinho.maiorValor());
    }
    
    @Test
    public void deveRetornarValorDoItemSeCarrinhoCom1Elemento()
    {
        carrinho.adiciona(new Item("Geladeira", 1, 900.0));
        
        Assertions.assertEquals(900.0, carrinho.maiorValor());
    }
    
    @Test
    public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos()
    {
        carrinho.adiciona(new Item("Geladeira", 1, 900.0));
        carrinho.adiciona(new Item("Fogão", 1, 1500.0));
        carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));
        
        Assertions.assertEquals(1500.0, carrinho.maiorValor());
    }
    
    @Test
    public void deveRetornarMenorValorSeCarrinhoContemMuitosElementos()
    {
        carrinho.adiciona(new Item("Geladeira", 1, 900.0));
        carrinho.adiciona(new Item("Fogão", 1, 1500.0));
        carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));
        
        Assertions.assertEquals(750.0, carrinho.menorValor());
    }
}
