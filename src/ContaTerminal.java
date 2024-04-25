import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia, cliente;
        float saldo;
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        cliente =  scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        agencia =  scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        numero =  scanner.nextInt();

        System.out.println("Qual o saldo da sua conta?");
        saldo =  scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %d e seu saldo de R$ %.2f já está disponível para saque.", cliente, agencia, numero, saldo );
    }
}
