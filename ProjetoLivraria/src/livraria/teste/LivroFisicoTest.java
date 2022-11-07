package livraria.teste;

import livraria.Autor;
import livraria.produtos.LivroFisico;
import org.junit.Test;
import static org.junit.Assert.*;


public class LivroFisicoTest {

    @Test
    public void aplicaDescontoDe(){
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(35.90);

        assertEquals(true, fisico.aplicaDescontoDe(0.3));
        assertEquals(false, fisico.aplicaDescontoDe(0.4));

    }

    @Test
    public void compareTo(){
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(35.90);

        Autor autor2 = new Autor();
        autor.setNome("Mauricio Aniche");
        LivroFisico fisico2 = new LivroFisico(autor2);
        fisico2.setNome("Test-Driven Development");
        fisico2.setValor(39.90);

        assertEquals(1,fisico2.compareTo(fisico));
        assertEquals(-1,fisico.compareTo(fisico2));
    }



}