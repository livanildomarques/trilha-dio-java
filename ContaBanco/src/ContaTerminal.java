import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Criando objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Por favor digite o número da conta: ");
        int numeroConta = scanner.nextInt(); 

        System.out.println("Digite a agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do titular: ");
        String nome = scanner.next();

        System.out.println("Digite o sobrenome do titular: ");
        String sobrenome = scanner.next();
        String nomeCliente = nome + " " + sobrenome;

        System.out.println("Digite o Saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " +agencia+ ", conta: "+ numeroConta+ ", e seu saldo " + saldo +  " $ já está disponível para saque.");
    }
}
