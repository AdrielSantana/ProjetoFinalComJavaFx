package livraria.frontend.btnaction;

import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

import livraria.frontend.MudarTela;
import livraria.frontend.pages.TelaLogin;

public class LoginBtnAction implements MouseInputListener {
    private JFrame tela;

    public LoginBtnAction(JFrame tela) {
        this.tela = tela;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        new MudarTela(tela, new TelaLogin());
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
