package livraria.teste;

import livraria.Autor;
import livraria.produtos.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class EbookTest {

    @Test
    public void aplicaDesconto() {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");
        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        assertEquals(true, ebook.aplicaDescontoDe(0.15));
    }

}