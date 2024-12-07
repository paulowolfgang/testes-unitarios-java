package br.dev.paulowolfgang.exemplos.loja_virtual.exemplo01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author Paulo Silva
 */
public class PrincipalTest {
    
    private CarrinhoDeCompras carrinho;
    private MaiorEMenor maior_e_menor;
    
    @BeforeEach
    public void inicializa()
    {
        this.carrinho = new CarrinhoDeCompras();
        this.maior_e_menor = new MaiorEMenor();
    }
    
    @Test
    public void apenasUmProduto()
    {
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        
        maior_e_menor.encontra(carrinho);
        Assertions.assertEquals("Geladeira", maior_e_menor.getMaior().getNome());
        Assertions.assertEquals("Geladeira", maior_e_menor.getMenor().getNome());
    }
    
    @Test
    public void ordemCrescente()
    {
        carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        
        maior_e_menor.encontra(carrinho);
        Assertions.assertEquals("Geladeira", maior_e_menor.getMaior().getNome());
        Assertions.assertEquals("Jogo de pratos", maior_e_menor.getMenor().getNome());
    }
    
    @Test
    public void ordemDecrescente()
    {
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
        
        maior_e_menor.encontra(carrinho);
        Assertions.assertEquals("Geladeira", maior_e_menor.getMaior().getNome());
        Assertions.assertEquals("Jogo de pratos", maior_e_menor.getMenor().getNome());
    }
    
    @Test
    public void produtoNaoOrdenado()
    {
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
        
        maior_e_menor.encontra(carrinho);
        Assertions.assertEquals("Geladeira", maior_e_menor.getMaior().getNome());
        Assertions.assertEquals("Jogo de pratos", maior_e_menor.getMenor().getNome());
    }
}
