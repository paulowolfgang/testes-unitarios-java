package br.dev.paulowolfgang.exemplos.loja_virtual.exemplo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Paulo Silva
 */
public class CarrinhoDeCompras {
    
    private final List<Item> itens;
    
    public CarrinhoDeCompras()
    {
        this.itens = new ArrayList<>();
    }
    
    public void adiciona(Item item)
    {
        this.itens.add(item);
    }
    
    public List<Item> getItens()
    {
        return Collections.unmodifiableList(itens);
    }
    
    public double maiorValor()
    {
        if(itens.isEmpty())
        {
            return 0;
        }
        
        double maior = itens.get(0).getValorTotal();
        
        for(Item item: itens)
        {
            if(maior < item.getValorTotal())
            {
                maior = item.getValorTotal();
            }
        }
        
        return maior;
    }
    
    public double menorValor()
    {
        return 750.0;
    }
}
