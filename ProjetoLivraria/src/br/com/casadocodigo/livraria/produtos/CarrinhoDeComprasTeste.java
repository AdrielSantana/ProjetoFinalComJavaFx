package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarrinhoDeComprasTeste {

    @Test
    public void removeProduto(){
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);

        assertEquals(true,carrinho.remove(fisico));

    }

    @Test
    public void adicionaProduto(){
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        assertEquals(true, carrinho.adiciona(fisico));
    }

}