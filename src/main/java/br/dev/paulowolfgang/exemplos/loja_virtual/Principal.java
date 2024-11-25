package br.dev.paulowolfgang.exemplos.loja_virtual;

/**
 *
 * @author Paulo Silva
 */
public class Principal {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
        
        MaiorEMenor algoritmo = new MaiorEMenor();
        algoritmo.encontra(carrinho);
        
        System.out.println("O maior produto: " + algoritmo.getMaior().getNome());
        System.out.println("O menor produto: " + algoritmo.getMenor().getNome());
    }
}
