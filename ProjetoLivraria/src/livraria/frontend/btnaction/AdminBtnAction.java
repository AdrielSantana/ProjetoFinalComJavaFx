package livraria.frontend.btnaction;

import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputListener;

import livraria.backend.Usuario;
import livraria.frontend.pages.TelaLogin;

public class AdminBtnAction implements MouseInputListener {
    private TelaLogin login;

    public AdminBtnAction(TelaLogin login) {
        this.login = login;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        String user = login.getUserField();
        char[] password = login.getPasswordField();
        String pass = new String(password);

        if (user.equals("admin") && pass.equals("admin")) {
            Usuario usuario = new Usuario(true);

            new IrParaMenu(login, usuario);
        } else {
            login.setSuccessLabel("Usuário ou senha errados.");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) 
    {}

    @Override
    public void mouseEntered(MouseEvent e) {}
    

    @Override
    public void mouseExited(MouseEvent e) {}
    

    @Override
    public void mouseDragged(MouseEvent e) 
    {}

    @Override
    public void mouseMoved(MouseEvent e) {}
    
}

    