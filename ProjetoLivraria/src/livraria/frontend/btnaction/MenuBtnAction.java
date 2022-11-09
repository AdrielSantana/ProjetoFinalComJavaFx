package livraria.frontend.btnaction;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

import livraria.backend.Usuario;

public class MenuBtnAction implements MouseInputListener {
    private JFrame tela;
    private Usuario usuario;

    public MenuBtnAction(JFrame tela, Usuario usuario) {
        this.tela = tela;
        this.usuario = usuario;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        new IrParaMenu(tela, usuario);
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
