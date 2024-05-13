public class Main {
    public static void main(String[] args) {
        Verificacao verificacao = new VerificacaoCredito();
        verificacao.setNext(new VerificacaoRenda());
        verificacao.setNext(new VerificacaoHistorico());
        verificacao.setNext(new VerificacaoGarantia());

        // Cliente 1: Alto rendimento, sem restrições, com garantia
Cliente cliente1 = new Cliente();
cliente1.rendaMensal = 20000.0;
cliente1.valorFinanciamento = 5000.0;
cliente1.restricaoSPC_SERASA = false;
cliente1.possuiGarantia = true;

// Cliente 2: Rendimento médio, sem restrições, sem garantia
Cliente cliente2 = new Cliente();
cliente2.rendaMensal = 8000.0;
cliente2.valorFinanciamento = 3000.0;
cliente2.restricaoSPC_SERASA = false;
cliente2.possuiGarantia = false;

// Cliente 3: Baixo rendimento, com restrições, sem garantia
Cliente cliente3 = new Cliente();
cliente3.rendaMensal = 3000.0;
cliente3.valorFinanciamento = 2000.0;
cliente3.restricaoSPC_SERASA = true;
cliente3.possuiGarantia = false;


        verificacao.verificar(cliente1);
    }
}