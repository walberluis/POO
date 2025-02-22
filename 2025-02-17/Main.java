package org.example;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static ArrayList<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine(); 
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double income = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                pessoas.add(new PessoaFisica(name, income, health));
            } else {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                pessoas.add(new PessoaJuridica(name, income, employees));
            }
        }


        System.out.println("\nTAXES PAID:");
        double total = 0.0;
        for (Pessoa tp : pessoas) {
            double tax = tp.tax();
            System.out.printf("%s: $ %.2f%n", tp.getNome(), tax);
            total += tax;
        }

        System.out.printf("\nTOTAL TAXES: $ %.2f%n", total);

    }

}
