package br.dev.paulowolfgang.exemplos.loja_virtual.exemplo01;

import br.dev.paulowolfgang.exemplos.loja_virtual.exemplo01.CarrinhoDeCompras;

/**
 *
 * @author Paulo Silva
 */
public class MaiorEMenor {
    
    private Produto menor;
    private Produto maior;
    
    public void encontra(CarrinhoDeCompras carrinho)
    {
        for(Produto produto: carrinho.getProdutos())
        {
            if(menor == null || produto.getValor() < menor.getValor())
            {
                menor = produto;
            }
            
            if (maior == null || produto.getValor() > maior.getValor()){
                maior = produto;
            }
        }
    }
    
    public Produto getMenor()
    {
        return menor;
    }
    
    public Produto getMaior()
    {
        return maior;
    }
}
