package livraria.frontend.pages;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

import livraria.backend.CarrinhoDeCompras;
import livraria.backend.Usuario;
import livraria.frontend.btnaction.MenuBtnAction;

public class TelaCarrinho extends JFrame {
    private Usuario usuario;
    private CarrinhoDeCompras carrinho;

    private static JButton voltarAoMenuBtn;
    private static JPanel panel;
    private static JPanel menuListPanel;
    private static JLabel titleLabel;

    public TelaCarrinho(Usuario usuario) {
        this.usuario = usuario;
        this.carrinho = usuario.getCarrinho();
        iniciarTela();
    }

    private void iniciarTela() {
        setSize(650, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(44, 139, 59));
        add(panel);

        titleLabel = new JLabel("Carrinho");
        titleLabel.setBounds(220, 50, 150, 25);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        panel.add(titleLabel);

        voltarAoMenuBtn = new JButton("Voltar ao Menu");
        voltarAoMenuBtn.setBounds(400, 50, 150, 25);
        voltarAoMenuBtn.addMouseListener(new MenuBtnAction(this, usuario));
        panel.add(voltarAoMenuBtn);

        menuListPanel = new JPanel();
        menuListPanel.setLayout(null);
        menuListPanel.setBounds(150, 100, 350, 300);
        menuListPanel.setBackground(Color.lightGray);
        panel.add(menuListPanel);
    }
}
