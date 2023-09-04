package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Funcionario extends BaseFuncionario {
    
    String cracha;
    String registro;
    String setor;
    String funcao;
    String horarioEntrada;
    String horarioSaida;
    
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public String getHorarioEntrada() {
        return horarioEntrada;
    }
    public void setHorarioEntrada(String horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }
    public String getHorarioSaida() {
        return horarioSaida;
    }
    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }
    public Funcionario(String cracha, String registro, LocalDate dataContratacao, LocalDate dataVinculoInicial,
            LocalDate dataVinculoFinal, String cracha2, String registro2, String setor, String funcao,
            String horarioEntrada, String horarioSaida) {
        super(cracha, registro, dataContratacao, dataVinculoInicial, dataVinculoFinal);
        cracha = cracha2;
        registro = registro2;
        this.setor = setor;
        this.funcao = funcao;
        this.horarioEntrada = horarioEntrada;
        this.horarioSaida = horarioSaida;
    }
}