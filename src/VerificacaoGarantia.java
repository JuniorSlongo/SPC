class VerificacaoGarantia implements Verificacao {
    private Verificacao next;

    @Override
    public void setNext(Verificacao next) {
        this.next = next;
    }

    @Override
    public void verificar(Cliente cliente) {
        // Simulando a verificação de garantias
        System.out.println("Verificando garantias...");
        if (cliente.possuiGarantia) {
            System.out.println("Garantia disponível!");
            if (next != null) {
                next.verificar(cliente);
            }
        } else {
            System.out.println("Sem garantia disponível.");
        }
    }
}