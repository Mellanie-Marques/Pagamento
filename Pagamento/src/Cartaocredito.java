public class Cartaocredito implements Pagamento {
    private String numeroCartao;
    private String expiracao;
    private String codigoSeguranca;

    public Cartaocredito(String numeroCartao, String expiracao, String codigoSeguranca) {
        this.numeroCartao = numeroCartao;
        this.expiracao = expiracao;
        this.codigoSeguranca = codigoSeguranca;
    }

    private boolean validarDados() {
        // Simulação de validação dos dados do cartão de crédito
        System.out.println("Validando dados do cartão de crédito...");
        if (numeroCartao != null && !numeroCartao.isEmpty() &&
                expiracao != null && !expiracao.isEmpty() &&
                codigoSeguranca != null && !codigoSeguranca.isEmpty()) {
            System.out.println("Dados do cartão válidos.");
            return true;
        } else {
            System.out.println("Dados do cartão inválidos.");
            return false;
        }
    }

    @Override
    public void processarPagamento(Pedido pedido) {
        if (validarDados()) {
            System.out.println("Processando pagamento de R$ " + pedido.getValorTotal() + " via Cartão de Crédito.");
            System.out.println("Pagamento via Cartão de Crédito efetuado com sucesso!");
        } else {
            System.out.println("Pagamento via Cartão de Crédito falhou.");
        }
    }
}

