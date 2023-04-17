package sql;

public class GestaoAcesso {
    private Integer idGestaoAcesso;
    private String email;
    private String senha;
    private Integer nivel;

    public GestaoAcesso(Integer idGestaoAcesso, String email, String senha, Integer nivel) {
        this.idGestaoAcesso = idGestaoAcesso;
        this.email = email;
        this.senha = senha;
        this.nivel = nivel;
    }

    public GestaoAcesso() {
    }

    public Integer getIdGestaoAcesso() {
        return idGestaoAcesso;
    }

    public void setIdGestaoAcesso(Integer idGestaoAcesso) {
        this.idGestaoAcesso = idGestaoAcesso;
    }
    
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "gestaoAcesso{" + ", email=" + email + ", senha=" + senha + ", nivel=" + nivel + '}';
    }
    
}
