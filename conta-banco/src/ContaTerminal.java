import java.util.Scanner;

public class ContaTerminal {
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;


        System.out.println("---------CONTA BANCARIA----------");
        System.out.println();
        System.err.println("por favor, digite o numero da conta: (2021)");
        numero = sc.nextInt();

        System.out.println("agora digite o numero da agencia: (321-7)");
        agencia = sc.next();

        System.out.println("me informe seu nome: ");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.println("agora me informe seu saldo atual: ");
        saldo = sc.nextDouble();



        System.out.println();
        System.out.printf("ola %s, obrigado por criar uma conta em "
        + "nosso banco, sua agencia é %s, "
        + "conta %d e seu saldo %.2f já está disponivel "
        + "para saque.", nomeCliente, agencia, numero, saldo);

        sc.close();

    }
}
