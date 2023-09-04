package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public abstract class BaseCliente extends BasePessoa {

    protected String documento;
    protected static String numeroCartao;
  
        public String getDocumento() {
        return documento;
    }
        public void setDocumento(String documento) {
        this.documento = documento;
    }
        public String getNumeroCartao() {
        return numeroCartao;
    }
        public void setNumeroCartao(String numeroCartao) {
        BaseCliente.numeroCartao = numeroCartao;
    }
        public BaseCliente(int codigo, String usuario, String senha, String nome, String endereco, String telefone,
            String email, String rg, String cpf, LocalDate dataNascimento, String documento, String numeroCartao) {
        super(codigo, usuario, senha, nome, endereco, telefone, email, rg, cpf, dataNascimento);
        this.documento = documento;
        BaseCliente.numeroCartao = numeroCartao;
    }

}
