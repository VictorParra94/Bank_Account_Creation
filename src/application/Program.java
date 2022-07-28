package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account account; // Inicia o objeto para ser utilizado no programa inteiro

        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine(); // Como foi utilizado um nextInt acima, precisamos consumir o espaço
        String accHolder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0); // Recebe o próximo char na posição 0
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initDeposit = sc.nextDouble();
            // Poderia ter criado o objeto a partir daqui, porem ficaria condicionado ao if e inacessível
            account = new Account(accNumber, accHolder, initDeposit); // Carrega o construtor com 3 valores
        } else {
            account = new Account(accNumber, accHolder); // Carrega o construtor com 2 valores
        }

        System.out.println("\nAccount data:"); // Utilizo \n para pular uma linha antes de iniciar
        System.out.println(account);

        char option = 0;
        double amount;

        while (option != 'F') {
            System.out.println("\nSelect one option:");
            System.out.println("Deposit = D");
            System.out.println("Withdraw = W");
            System.out.println("Finish = F");
            System.out.print("Option? = ");
            option = sc.next().charAt(0);

            if (option == 'D') {
                System.out.print("\nEnter a deposit value: ");
                amount = sc.nextDouble();
                account.deposit(amount);// Chama o método deposit passando como argumento a variável amount
                System.out.println("\nUpdated account data:");
                System.out.println(account);
            } else if (option == 'W') {
                System.out.print("\nEnter a withdraw value: ");
                amount = sc.nextDouble();
                account.withdraw(amount); // Chama o método withdraw passando como argumento a variável amount
                System.out.println("\nUpdated account data:");
                System.out.println(account);
            }
        }
        System.out.println("\nThanks!");
    }
}
