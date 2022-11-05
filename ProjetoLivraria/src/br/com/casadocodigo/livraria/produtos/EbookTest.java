package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EbookTest {

    @Test

    public void aplicaDesconto(){
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");
        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        assertEquals(true, ebook.aplicaDescontoDe(0.15));


    }

}