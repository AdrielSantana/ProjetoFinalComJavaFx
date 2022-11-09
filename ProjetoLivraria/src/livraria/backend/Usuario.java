package livraria.backend;

public class Usuario {
    private Boolean permissao;
    private CarrinhoDeCompras carrinho;

    public Usuario(Boolean permissao) {
        this.permissao = permissao;
    }

    public Boolean getPermissao() {
        return this.permissao;
    }
}