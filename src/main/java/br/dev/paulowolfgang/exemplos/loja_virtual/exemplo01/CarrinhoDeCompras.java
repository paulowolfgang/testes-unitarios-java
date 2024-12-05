package br.dev.paulowolfgang.exemplos.loja_virtual.exemplo01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paulo Silva
 */
public class CarrinhoDeCompras {
    
    private final List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adiciona(Produto produto) {
        if (produto != null) {
            this.produtos.add(produto);
        }
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
