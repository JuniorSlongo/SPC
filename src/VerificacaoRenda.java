public class VerificacaoRenda implements Verificacao {
    private Verificacao next;

    @Override
    public void setNext(Verificacao next) {
        this.next = next;
    }

    @Override
    public void verificar(Cliente cliente) {
        // Simulando a verificação de renda
        System.out.println("Verificando compatibilidade da renda...");
        if (cliente.valorFinanciamento / cliente.rendaMensal <= 0.25) {
            System.out.println("Renda compatível!");
            if (next != null) {
                next.verificar(cliente);
            }
        } else {
            System.out.println("Renda incompatível.");
        }
    }
}