package uniderp.poo.escola.dominio;

public abstract class BaseDadosComuns extends BaseIdentificador {

    protected String usuario;
    protected String senha;
   
        public String getUsuario() {
        return usuario;
    }
        public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
        public String getSenha() {
        return senha;
    }
        public void setSenha(String senha) {
        this.senha = senha;
    }
   
        public BaseDadosComuns(int codigo, String usuario, String senha) {
        super(codigo);
        this.usuario = usuario;
        this.senha = senha;
    }
}
