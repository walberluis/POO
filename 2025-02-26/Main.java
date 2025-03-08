package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int numero = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String titular = sc.nextLine();

            System.out.print("Initial balance: ");
            double saldo = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double limiteSaque = sc.nextDouble();

            ContaBancaria conta = new ContaBancaria(numero, titular, saldo, limiteSaque);

            System.out.print("\nEnter amount for withdraw: ");
            double valorSaque = sc.nextDouble();

            conta.sacar(valorSaque);
            System.out.printf("New balance: %.2f%n", conta.getSaldo());

        } catch (LimSaqExcedidoException | SaldoInsufException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
