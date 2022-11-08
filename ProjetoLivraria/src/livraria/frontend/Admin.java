package livraria.frontend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin implements ActionListener  {
    GUI gui = new GUI();

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = gui.getUserField();
        String password = gui.getPasswordField();

        if(user.equals("admin") && password.equals("admin")){
            gui.setSuccessLabel("Entrou com sucesso!");
        } else {
            gui.setSuccessLabel("Usuário ou senha errados.");
        }
    }
}
