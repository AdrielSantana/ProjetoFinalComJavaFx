package livraria.frontend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import livraria.backend.Usuario;

public class Cliente implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        Usuario usuario = new Usuario(false);
    }
}
