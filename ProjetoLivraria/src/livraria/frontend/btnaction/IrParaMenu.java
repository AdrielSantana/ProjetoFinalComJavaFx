package livraria.frontend.btnaction;

import javax.swing.JFrame;

import livraria.backend.Usuario;
import livraria.frontend.MudarTela;
import livraria.frontend.pages.Menu;

public class IrParaMenu {
    public IrParaMenu(JFrame tela, Usuario usuario) {
        new MudarTela(tela, new Menu(usuario));
    }
}
