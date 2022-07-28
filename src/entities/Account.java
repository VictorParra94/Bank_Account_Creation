package entities;

public class Account {

    private final int accNumber; // Atributo final por receber apenas um valor imutável
    private String accHolder; // Atributo
    private double accBalance; // Atributo

    public Account(int accNumber, String accName, double initDeposit) { // Construtor com 3 atributos
        this.accNumber = accNumber;
        this.accHolder = accName;
        deposit(initDeposit); // Recebe a variável e já executa o método de deposito
    }

    public Account(int accNumber, String accName) { // Construtor com 2 atributos
        this.accNumber = accNumber;
        this.accHolder = accName;
    }

    public void deposit(double amount) { // Método para deposito somando ao accBalance
        accBalance += amount;
    }

    public void withdraw(double amount) { // Método para saque subtraindo do accBalance
        accBalance -= amount + 5;
    }

    public int getAccNumber() {
        return accNumber;
    } // Get para o accNumber

    public String getAccHolder() {
        return accHolder;
    } // Get para o accHolder

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    } // Set para o accHolder

    public double getAccBalance() {
        return accBalance;
    } // Get para o accBalance

    public String toString() { // Transforma o objeto em String para exibição quando chamado
        return "Account " + accNumber + ", Holder: " + accHolder + ", Balance: $" + String.format("%.2f", accBalance);
    }
}

// Como somente por meio do método eu consigo alterar o valor de accBalance, se torna um encapsulamento
