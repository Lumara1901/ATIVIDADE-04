package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Passageiro extends BaseCliente {
    
    String usuario;
    LocalDate dataCompra;
    String numeroPassagem;
   
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public LocalDate getDataCompra() {
        return dataCompra;
    }
    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }
    public String getNumeroPassagem() {
        return numeroPassagem;
    }
    public void setNumeroPassagem(String numeroPassagem) {
        this.numeroPassagem = numeroPassagem;
    }
    public Passageiro(int codigo, String usuario, String senha, String nome, String endereco, String telefone,
            String email, String rg, String cpf, LocalDate dataNascimento, String documento, String numeroCartao,
            String usuario2, LocalDate dataCompra, String numeroPassagem) {
        super(codigo, usuario, senha, nome, endereco, telefone, email, rg, cpf, dataNascimento, documento,
                numeroCartao);
        usuario = usuario2;
        this.dataCompra = dataCompra;
        this.numeroPassagem = numeroPassagem;
    }
    public Passageiro() {
    }
}