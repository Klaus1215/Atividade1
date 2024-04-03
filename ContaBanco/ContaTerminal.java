package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        System.out.print("Digite o nome do titular da conta: ");
        nome = scanner.nextLine();

        int numero;
        System.out.print("Digite o número da conta: ");
        numero = scanner.nextInt();

        String agencia;
        System.out.print("Digite a agência da conta: ");
        agencia = scanner.next();

        double saldo;
        System.out.print("Digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + "!" + "\n" + "Obrigado por criar uma conta no nosso Banco" + "\n"
                + "Sua Agência é:" + agencia + "\n" + "Seu número de conta é:" + numero + "\n" + "Seu saldo é de: R$"
                + saldo + "\n" + "Obrigado por escolher o nosso Banco!");

        scanner.close();

    }

}
