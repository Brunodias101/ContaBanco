import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContaTerminal contaTerminal = new ContaTerminal();
        System.out.println("Por favor, digite o número da agencia:");
        contaTerminal.numero = scanner.nextInt();
        System.out.println("Por favor, digite a agencia:");
        contaTerminal.agencia = scanner.next();
        System.out.println("Por favor, digite o nome:");
        contaTerminal.nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo:");
        contaTerminal.saldo = scanner.nextDouble();

        System.out.println("Olá " + contaTerminal.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                contaTerminal.agencia + ", conta " + contaTerminal.numero + " e seu saldo " + contaTerminal.saldo + " já está disponível para saque.");



    }
}