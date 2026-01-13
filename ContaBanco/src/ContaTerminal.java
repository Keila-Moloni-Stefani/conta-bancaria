import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        // Solicitando os dados ao usuário
        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo:");
        saldo = scanner.nextDouble();
        
        // Fechando o scanner
        scanner.close();
        
        // Exibindo a mensagem final com os dados concatenados
        String mensagem = "Olá ".concat(nomeCliente)
                        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                        .concat(agencia)
                        .concat(", conta ")
                        .concat(String.valueOf(numero))
                        .concat(" e seu saldo ")
                        .concat(String.format("%.2f", saldo))
                        .concat(" já está disponível para saque");
        
        System.out.println("\n" + mensagem);
    }
}