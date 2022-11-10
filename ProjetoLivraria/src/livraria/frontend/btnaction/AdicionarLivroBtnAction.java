package livraria.frontend.btnaction;

import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputListener;

import livraria.backend.Usuario;
import livraria.frontend.MudarTela;
import livraria.frontend.pages.Menu;
import livraria.frontend.pages.TelaAdicionaLivro;

public class AdicionarLivroBtnAction implements MouseInputListener {
    private Menu tela;
    private Usuario usuario;

    public AdicionarLivroBtnAction(Menu tela, Usuario usuario) {
        this.tela = tela;
        this.usuario = usuario;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (usuario.getPermissao()) {
            new MudarTela(tela, new TelaAdicionaLivro(usuario));
        } else {
            tela.setPermissionDeniedLabel("Usuário precisa ser Admin");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

}
