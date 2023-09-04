package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public abstract class BasePessoa extends BaseDadosComuns{
 
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected String email;
    protected String rg;
    protected String cpf;
    protected LocalDate dataNascimento;
  
        public String getNome() {
        return nome;
    }
        public void setNome(String nome) {
        this.nome = nome;
    }
        public String getEndereco() {
        return endereco;
    }
        public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
        public String getTelefone() {
        return telefone;
    }
        public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
        public String getEmail() {
        return email;
    }
        public void setEmail(String email) {
        this.email = email;
    }
        public String getRg() {
        return rg;
    }
        public void setRg(String rg) {
        this.rg = rg;
    }
        public String getCpf() {
        return cpf;
    }
        public void setCpf(String cpf) {
        this.cpf = cpf;
    }
        public LocalDate getDataNascimento() {
        return dataNascimento;
    }
        public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
        public BasePessoa(int codigo, String usuario, String senha, String nome, String endereco, String telefone,
            String email, String rg, String cpf, LocalDate dataNascimento) {
        super(codigo, usuario, senha);
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
}