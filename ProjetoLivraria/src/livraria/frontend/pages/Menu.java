package livraria.frontend.pages;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

import livraria.backend.Usuario;
import livraria.frontend.btnaction.CarrinhoBtnAction;
import livraria.frontend.btnaction.LoginBtnAction;

public class Menu extends JFrame {
    private Usuario usuario;
    private String permissaoDeUsuario;

    private static JButton carrinhoBtn;
    private static JPanel panel;
    private static JPanel menuListPanel;
    private static JLabel titleLabel;
    private static JLabel userLabel;

    private static JButton voltarAoLoginBtn;

    public Menu(Usuario usuario) {
        this.usuario = usuario;
        iniciarTela();
    }

    private void iniciarTela() {
        setSize(650, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(44, 139, 59));
        add(panel);

        permissaoDeUsuario = usuario.getPermissao() ? "Admin" : "Cliente";

        userLabel = new JLabel("Usuário: " + this.permissaoDeUsuario);
        userLabel.setBounds(20, 50, 150, 25);
        userLabel.setFont(new Font("Arial", Font.BOLD, 16));
        userLabel.setForeground(Color.white);
        panel.add(userLabel);

        voltarAoLoginBtn = new JButton("Sair");
        voltarAoLoginBtn.setBounds(20, 80, 60, 25);
        voltarAoLoginBtn.addMouseListener(new LoginBtnAction(this));
        panel.add(voltarAoLoginBtn);

        titleLabel = new JLabel("Tela de Menu");
        titleLabel.setBounds(220, 50, 400, 25);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        panel.add(titleLabel);

        menuListPanel = new JPanel();
        menuListPanel.setLayout(null);
        menuListPanel.setBounds(150, 100, 350, 220);
        menuListPanel.setBackground(Color.lightGray);
        panel.add(menuListPanel);

        carrinhoBtn = new JButton("Carrinho de compras");
        carrinhoBtn.setBounds(80, 20, 200, 25);
        carrinhoBtn.addMouseListener(new CarrinhoBtnAction(this, this.usuario));
        menuListPanel.add(carrinhoBtn);

    }
}