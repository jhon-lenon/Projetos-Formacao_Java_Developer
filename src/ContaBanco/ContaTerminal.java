package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    static String nomeCliente;
    static int agencia;
    static int numero;
    static double saldo;

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, informe o seu nome:");
        nomeCliente = scan.next();
        System.out.println("Olá " + nomeCliente + ", digite o número da sua agencia: ");
        agencia = scan.nextInt();
        System.out.println("Informe o número de sua conta: ");
        numero = scan.nextInt();
        System.out.println("Por favor, informe o Saldo inicial");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

