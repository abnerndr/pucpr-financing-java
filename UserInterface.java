import java.util.Scanner;

class UserInterface {
    private Scanner scanner;

    // Construtor
    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    // Validar valor
    public double validationAmount(double amount){
        if (amount <= 0) {
            System.out.println("O valor informado não pode ser negativo e não pode ser 0 (zero)");
        }
        return amount;
    }

    // inputar valor do imóvel
    public double inputPropertyAmount() {
        double amount;
        do {
            System.out.print("Valor do imóvel, valor não deve ser zero ou negativo: ");
            amount = scanner.nextDouble();
            validationAmount(amount);
        } while (amount <= 0);
        return amount;
    }

    // inputar prazo
    public int inputDeadlineFinancing() {
        int deadline;
        do {
            System.out.print("Digite o prazo do financiamento em anos (deve ser positivo): ");
            deadline = scanner.nextInt();
            validationAmount(deadline);
        } while (deadline <= 0);
        return deadline;
    }

    // inputar taxa de juros
    public double inputRate() {
        double rate;
        do {
            System.out.print("Digite a taxa de juros anual (%) (deve ser positiva): ");
            rate = scanner.nextDouble();
            validationAmount(rate);
        } while (rate <= 0);
        return rate;
    }
}