package livraria.backend.teste;

import org.junit.Test;
import static org.junit.Assert.*;

import livraria.backend.Editora;
import livraria.backend.produtos.Revista;

public class RevistaTest  {

    @Test
    public void aplicaDescontoDe(){
        Editora editora = new Editora();
        editora.setNomeFantasia("Colibra");

        Revista revista = new Revista();
        revista.setEditora(editora);

        assertEquals(true, revista.aplicaDescontoDe(0.05));
        assertEquals(false, revista.aplicaDescontoDe(0.6));
    }

    @Test
    public void compareTo(){
        Editora editora = new Editora();
        editora.setNomeFantasia("Colibra");

        Revista revista = new Revista();
        revista.setEditora(editora);
        revista.setValor(29.90);

        Revista revista2 = new Revista();
        revista.setEditora(editora);
        revista.setValor(22.90);

        assertEquals(1,revista.compareTo(revista2));
        assertEquals(-1,revista2.compareTo(revista));

    }



}
