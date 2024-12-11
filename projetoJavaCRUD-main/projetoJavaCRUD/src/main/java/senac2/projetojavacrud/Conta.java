package senac2.projetojavacrud;

import java.util.Date;

public class Conta {
    private String nomeConta;
    private String categoriaConta;
    private Date dataCriacaoConta;
    private boolean status;

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public String getCategoriaConta() {
        return categoriaConta;
    }

    public void setCategoriaConta(String categoriaConta) {
        this.categoriaConta = categoriaConta;
    }

    public Date getDataCriacaoConta() {
        return dataCriacaoConta;
    }

    public void setDataCriacaoConta(Date dataCriacaoConta) {
        this.dataCriacaoConta = dataCriacaoConta;
    }

    public boolean isContaEstaAtiva() {
        return status;
    }

    public void setContaEstaAtiva(boolean ContaEstaAtiva) {
        this.status = ContaEstaAtiva;
    }

    public Conta(String nomeConta, String categoriaConta, Date dataCriacaoConta, boolean ContaEstaAtiva) {
        this.nomeConta = nomeConta;
        this.categoriaConta = categoriaConta;
        this.dataCriacaoConta = dataCriacaoConta;
        this.status = ContaEstaAtiva;
    }
}
