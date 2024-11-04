import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar o pedido
        System.out.print("Digite o valor total do Pedido: ");
        double valorTotal = scanner.nextDouble();
        Pedido pedido = new Pedido(valorTotal);

        // Escolher a forma de pagamento
        System.out.println("Escolha a Forma de Pagamento:");
        System.out.println("1. PayPal");
        System.out.println("2. Cartão de Crédito");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        Pagamento Pagamento = null;

        if (opcao == 1) {
            System.out.print("Digite seu email do PayPal: ");
            String email = scanner.nextLine();
            System.out.print("Digite sua senha do PayPal: ");
            String senha = scanner.nextLine();
            Pagamento = new Paypal(email, senha);
        } else if (opcao == 2) {
            System.out.print("Digite o número do cartão: ");
            String numeroCartao = scanner.nextLine();
            System.out.print("Digite a data de expiração (mm/aa): ");
            String expiracao = scanner.nextLine();
            System.out.print("Digite o código de segurança: ");
            String codigoSeguranca = scanner.nextLine();
            Pagamento = new Cartaocredito(numeroCartao, expiracao, codigoSeguranca);
        } else {
            System.out.println("Opção inválida.");
            scanner.close();
            return;
        }

        // Processar o pagamento
        if (Pagamento != null) {
            Pagamento.processarPagamento(pedido);
        }

        scanner.close();
    }
}
