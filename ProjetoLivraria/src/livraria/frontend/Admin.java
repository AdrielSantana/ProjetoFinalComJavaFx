package livraria.frontend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin implements ActionListener  {
    GUI gui = new GUI();

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = gui.getUserField();
        char[] password = gui.getPasswordField();
        String pass = new String(password);

        if(user.equals("admin") && pass.equals("admin")){
            gui.setSuccessLabel("Entrou com sucesso!");
        } else {
            gui.setSuccessLabel("Usuário ou senha errados.");
        }
    }
}
