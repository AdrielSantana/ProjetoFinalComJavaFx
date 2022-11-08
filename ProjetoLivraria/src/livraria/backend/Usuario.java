package livraria.backend;

public class Usuario {
    private Boolean permissao;

    public Usuario(Boolean user) {
        permissao = user;
    }

    public Boolean getPermissao() {
        return permissao;
    }
}