public class Cliente{
    double rendaMensal;
    double valorFinanciamento;
    boolean restricaoSPC_SERASA;
    boolean possuiGarantia;

    public double getRendaMensal() {
        return rendaMensal;
    }
    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }
    public double getValorFinanceiro() {
        return valorFinanciamento;
    }
    public void setValorFinanceiro(double valorFinanceiro) {
        this.valorFinanciamento = valorFinanceiro;
    }
    public boolean isRestricaoSPC_SERASA() {
        return restricaoSPC_SERASA;
    }
    public void setRestricaoSPC_SERASA(boolean restricaoSPC_SERASA) {
        this.restricaoSPC_SERASA = restricaoSPC_SERASA;
    }
    public boolean isPossuiGarantia() {
        return possuiGarantia;
    }
    public void setPossuiGarantia(boolean possuiGarantia) {
        this.possuiGarantia = possuiGarantia;
    }
}