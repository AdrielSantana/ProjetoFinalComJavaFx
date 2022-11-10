package livraria.frontend.btnaction;

import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

import livraria.backend.Usuario;
import livraria.frontend.MudarTela;
import livraria.frontend.pages.TelaCarrinho;

public class CarrinhoBtnAction implements MouseInputListener {
    private JFrame tela;
    private Usuario usuario;

    public CarrinhoBtnAction(JFrame tela, Usuario usuario) {
        this.tela = tela;
        this.usuario = usuario;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        new MudarTela(tela, new TelaCarrinho(this.usuario));
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
