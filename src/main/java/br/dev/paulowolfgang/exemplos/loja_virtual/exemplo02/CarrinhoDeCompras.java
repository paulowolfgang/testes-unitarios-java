package br.dev.paulowolfgang.exemplos.loja_virtual.exemplo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Paulo Silva
 */
public class CarrinhoDeCompras {
    
    private List<Item> itens;
    
    public CarrinhoDeCompras()
    {
        this.itens = new ArrayList<Item>();
    }
    
    public void adiciona(Item item)
    {
        this.itens.add(item);
    }
    
    public List<Item> getItens()
    {
        return Collections.unmodifiableList(itens);
    }
}
