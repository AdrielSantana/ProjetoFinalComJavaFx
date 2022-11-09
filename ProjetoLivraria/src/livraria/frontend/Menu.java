package livraria.frontend;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

import livraria.backend.Usuario;

public class Menu extends JFrame {
    private Usuario usuario;
    private static JPanel panel;
    private static JPanel adminPanel;
    private static JLabel titleLabel;

    Menu(Usuario usuario) {
        iniciarTela();
        this.usuario = usuario;
    }

    private void iniciarTela() {
        setSize(650, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(44, 139, 59));
        add(panel);

        titleLabel = new JLabel("Tela de Menu");
        titleLabel.setBounds(130, 50, 400, 25);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        panel.add(titleLabel);

        adminPanel = new JPanel();
        adminPanel.setLayout(null);
        adminPanel.setBounds(150, 100, 350, 220);
        adminPanel.setBackground(Color.lightGray);

        panel.add(adminPanel);
    }
}