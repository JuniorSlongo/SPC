public class VerificacaoHistorico implements Verificacao {
    private Verificacao next;

    @Override
    public void setNext(Verificacao next) {
        this.next = next;
    }

    @Override
    public void verificar(Cliente cliente) {
        // Simulando a verificação de histórico de crédito
        System.out.println("Verificando histórico de crédito...");
        if (!cliente.restricaoSPC_SERASA) {
            System.out.println("Histórico de crédito limpo!");
            if (next != null) {
                next.verificar(cliente);
            }
        } else {
            System.out.println("Restrição no SPC/SERASA.");
        }
    }
}