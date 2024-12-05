package br.dev.paulowolfgang.exemplos.loja_virtual.exemplo02;

/**
 *
 * @author Paulo Silva
 */
public class MaiorPreco {
    
    public double encontra(CarrinhoDeCompras carrinho)
    {
        if(carrinho.getItens().isEmpty())
        {
            return 0;
        }
        
        double maior = carrinho.getItens().get(0).getValorTotal();
        
        for(Item item: carrinho.getItens())
        {
            if(maior < item.getValorTotal())
            {
                maior = item.getValorTotal();
            }
        }
        
        return maior;
    }
}
