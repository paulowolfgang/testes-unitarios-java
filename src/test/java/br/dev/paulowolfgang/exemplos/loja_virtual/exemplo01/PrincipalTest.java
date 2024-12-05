package br.dev.paulowolfgang.exemplos.loja_virtual.exemplo01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author Paulo Silva
 */
public class PrincipalTest {
    
    @Test
    public void apenasUmProduto()
    {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        
        MaiorEMenor maior_e_menor = new MaiorEMenor();
        maior_e_menor.encontra(carrinho);
        
        Assertions.assertEquals("Geladeira", maior_e_menor.getMaior().getNome());
        Assertions.assertEquals("Geladeira", maior_e_menor.getMenor().getNome());
    }
    
    @Test
    public void ordemCrescente()
    {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        
        MaiorEMenor maior_e_menor = new MaiorEMenor();
        maior_e_menor.encontra(carrinho);
        
        Assertions.assertEquals("Geladeira", maior_e_menor.getMaior().getNome());
        Assertions.assertEquals("Jogo de pratos", maior_e_menor.getMenor().getNome());
    }
    
    @Test
    public void ordemDecrescente()
    {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
        
        MaiorEMenor maior_e_menor = new MaiorEMenor();
        maior_e_menor.encontra(carrinho);
        
        Assertions.assertEquals("Geladeira", maior_e_menor.getMaior().getNome());
        Assertions.assertEquals("Jogo de pratos", maior_e_menor.getMenor().getNome());
    }
    
    @Test
    public void produtoNaoOrdenado()
    {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
        
        MaiorEMenor maior_e_menor = new MaiorEMenor();
        maior_e_menor.encontra(carrinho);
        
        Assertions.assertEquals("Geladeira", maior_e_menor.getMaior().getNome());
        Assertions.assertEquals("Jogo de pratos", maior_e_menor.getMenor().getNome());
    }
}
