import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Peter Parker";
        String tipoConta = "Conta Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("**********************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n**********************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar Saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor a ser transferido: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valor;
                    System.out.println("Transferência realizada com sucesso!");
                    System.out.println("Seu saldo atual é: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Recebimento realizado com sucesso!");
            } else if (opcao == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }
        }

        leitura.close();
    }
}
