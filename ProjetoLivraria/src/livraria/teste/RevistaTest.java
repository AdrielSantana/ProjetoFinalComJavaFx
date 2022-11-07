package livraria.teste;

import org.junit.Test;
import static org.junit.Assert.*;

import livraria.Editora;
import livraria.produtos.Revista;

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

}
