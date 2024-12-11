package senac2.projetojavacrud;

import java.util.Date;

public class DespesaRenda {
    private String descDespesa;
    private String CategoriaDespesa;
    private Date dataCriacaoDespesa;

    public String getDescDespesa() {
        return descDespesa;
    }

    public void setDescDespesa(String descDespesa) {
        this.descDespesa = descDespesa;
    }

    public String getCategoriaDespesa() {
        return CategoriaDespesa;
    }

    public void setCategoriaDespesa(String CategoriaDespesa) {
        this.CategoriaDespesa = CategoriaDespesa;
    }

    public Date getDataCriacaoDespesa() {
        return dataCriacaoDespesa;
    }

    public void setDataCriacaoDespesa(Date dataCriacaoDespesa) {
        this.dataCriacaoDespesa = dataCriacaoDespesa;
    }

    public DespesaRenda(String descDespesa, String CategoriaDespesa, Date dataCriacaoDespesa) {
        this.descDespesa = descDespesa;
        this.CategoriaDespesa = CategoriaDespesa;
        this.dataCriacaoDespesa = dataCriacaoDespesa;
    }
}
