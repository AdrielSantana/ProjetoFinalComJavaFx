package livraria.teste;

import livraria.GerenciadorDeCupons;

import org.junit.Test;
import static org.junit.Assert.*;

public class GerenciadorDeCuponsTest {
    GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();

    @Test
    public void adicionaCupom1() {
        assertEquals(true, gerenciador.adicionaCupom("off10.5", 10.5));
    }

    @Test
    public void adicionaCupom2() {
        assertEquals(false, gerenciador.adicionaCupom("off13", 13.0));
    }

    @Test
    public void validaCupom() {
        assertEquals(null, gerenciador.validaCupom("off10"));

        assertEquals(13.0, gerenciador.validaCupom("off13"), 0);
    }

}
