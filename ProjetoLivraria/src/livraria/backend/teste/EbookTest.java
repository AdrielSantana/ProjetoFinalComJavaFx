package livraria.backend.teste;

import livraria.backend.Autor;
import livraria.backend.produtos.*;
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

    @Test
    public void compareTo(){
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");
        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        Autor autor2 = new Autor();
        autor.setNome("Mauricio Aniche");
        Ebook ebook2 = new Ebook(autor2);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(22.90);

        assertEquals(1,ebook.compareTo(ebook2));
        assertEquals(-1,ebook2.compareTo(ebook));

    }

}