public class VerificacaoCredito implements Verificacao {
    private Verificacao next;

    @Override
    public void setNext(Verificacao next){
        this.next = next;
    }
    @Override
    public void verificar(Cliente cliente) {
        // Simulando a verificação de crédito
        System.out.println("Verificando disponibilidade de crédito...");
        if (Math.random() > 0.2) {
            System.out.println("Crédito disponível!");
            if (next != null) {
                next.verificar(cliente);
            }
        } else {
            System.out.println("Crédito indisponível.");
        }
    }
}
