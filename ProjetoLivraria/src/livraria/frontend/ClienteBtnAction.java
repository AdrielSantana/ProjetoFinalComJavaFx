package livraria.frontend;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputListener;

import livraria.backend.Usuario;

public class ClienteBtnAction implements MouseInputListener {
    private TelaLogin login;

    public ClienteBtnAction(TelaLogin login) {
        this.login = login;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Usuario usuario = new Usuario(false);
        login.dispose();
        new Menu(usuario).setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {}

}
