package livraria.backend.teste;

import org.junit.Test;

import livraria.backend.Autor;
import livraria.backend.EstoqueDeLivro;
import livraria.backend.produtos.LivroFisico;

import static org.junit.Assert.*;

public class EstoqueDeLivroTest {
    @Test
    public void adicionaLivro() {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(35.90);

        assertEquals(true, EstoqueDeLivro.adicionaLivro("livro fisico", fisico));
    }

    @Test
    public void removeLivro() {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(35.90);

        EstoqueDeLivro.adicionaLivro("livro fisico", fisico);

        assertEquals(true, EstoqueDeLivro.removeLivro("livro fisico"));
    }

    @Test
    public void achaLivro() {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(35.90);

        EstoqueDeLivro.adicionaLivro("livro fisico", fisico);

        assertEquals(fisico, EstoqueDeLivro.achaLivro("livro fisico"));

        assertEquals(null, EstoqueDeLivro.achaLivro("livro digital"));
    }

}
