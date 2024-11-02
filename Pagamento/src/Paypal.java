import java.util.Scanner;


public class Paypal implements Pagamento {
    private String email;
    private String senha;

    public Paypal(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    private boolean autenticar() {
        // Simulação de autenticação do PayPal
        System.out.println("Autenticando no PayPal...");
        if (email != null && !email.isEmpty() && senha != null && !senha.isEmpty()) {
            System.out.println("Autenticação bem-sucedida.");
            return true;
        } else {
            System.out.println("Falha na autenticação.");
            return false;
        }
    }

    @Override
    public void processarPagamento(Pedido pedido) {
        if (autenticar()) {
            System.out.println("Processando pagamento de R$ " + pedido.getValorTotal() + " via PayPal.");
            System.out.println("Pagamento via PayPal efetuado com sucesso!");
        } else {
            System.out.println("Pagamento via PayPal falhou.");
        }
    }
}
