package senac2.projetojavacrud;

import java.util.Date;

public class Movimentações {
    private Date dataMovimentacao;
    private boolean eDespesa;
    private int idMovimentacao;
    private String obsMovimentacao;
    private Double valorMovimentacao;
    private Conta contaReferente;

    public Date getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(Date dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public boolean iseDespesa() {
        return eDespesa;
    }

    public void seteDespesa(boolean eDespesa) {
        this.eDespesa = eDespesa;
    }

    public int getIdMovimentacao() {
        return idMovimentacao;
    }

    public void setIdMovimentacao(int idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public String getObsMovimentacao() {
        return obsMovimentacao;
    }

    public void setObsMovimentacao(String obsMovimentacao) {
        this.obsMovimentacao = obsMovimentacao;
    }

    public Double getValorMovimentacao() {
        return valorMovimentacao;
    }

    public void setValorMovimentacao(Double valorMovimentacao) {
        this.valorMovimentacao = valorMovimentacao;
    }

    public Conta getContaReferente() {
        return contaReferente;
    }

    public void setContaReferente(Conta contaReferente) {
        this.contaReferente = contaReferente;
    }

    public Movimentações(Date dataMovimentacao, boolean eDespesa, int idMovimentacao, String obsMovimentacao, Double valorMovimentacao, Conta contaReferente) {
        this.dataMovimentacao = dataMovimentacao;
        this.eDespesa = eDespesa;
        this.idMovimentacao = idMovimentacao;
        this.obsMovimentacao = obsMovimentacao;
        this.valorMovimentacao = valorMovimentacao;
        this.contaReferente = contaReferente;
    }
}
