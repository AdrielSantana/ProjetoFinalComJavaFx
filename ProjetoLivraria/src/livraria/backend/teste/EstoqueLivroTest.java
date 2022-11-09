package livraria.backend.teste;

import org.junit.Test;

import livraria.backend.Autor;
import livraria.backend.EstoqueLivro;
import livraria.backend.produtos.LivroFisico;

import static org.junit.Assert.*;

public class EstoqueLivroTest {
    EstoqueLivro estoqueLivro = new EstoqueLivro();

    @Test
    public void adicionaLivro() {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(35.90);

        assertEquals(true, estoqueLivro.adicionaLivro("livro fisico", fisico));
    }

    @Test
    public void removeLivro() {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(35.90);

        estoqueLivro.adicionaLivro("livro fisico", fisico);

        assertEquals(true, estoqueLivro.removeLivro("livro fisico"));
    }

    @Test
    public void achaLivro() {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(35.90);

        estoqueLivro.adicionaLivro("livro fisico", fisico);

        assertEquals(fisico, estoqueLivro.achaLivro("livro fisico"));

        assertEquals(null, estoqueLivro.achaLivro("livro digital"));
    }

}
