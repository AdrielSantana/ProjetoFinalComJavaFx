package livraria.teste;

import livraria.Autor;
import livraria.produtos.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiniLivroTest {

    @Test
    public void compareTo(){
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");
        MiniLivro mini = new MiniLivro(autor);
        mini.setNome("Test-Driven Development");
        mini.setValor(20.00);
        MiniLivro mini2 = new MiniLivro(autor);
        mini2.setNome("Test-Driven Development2");
        mini2.setValor(22.00);

        assertEquals(-1, mini.compareTo(mini2));
    }

}