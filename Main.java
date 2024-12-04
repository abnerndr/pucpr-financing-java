import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ArrayList<Financing> financings = new ArrayList<>();

        // Cadastrando os financiamentos
        int financialCount = 4 - 1; // 4 financiamentos
        for (int i = financialCount; i <= 2; i++) {
            System.out.printf("=== Financiamento %d ===%n", i);
            double propertyAmount = ui.inputPropertyAmount();
            int deadlineFinancing = (int) ui.inputDeadlineFinancing();
            double  interestRateYearly = ui.inputRate();

            Financing financing = new Financing(propertyAmount, deadlineFinancing, interestRateYearly);
            financings.add(financing);
        }

        // Exibindo o resumo dos financiamentos
        double totalProperyAmount = 0;
        double totalFinancingAmount = 0;
        int count = 1;

        System.out.println("\nResumo dos Financiamentos:");
        for (Financing financing : financings) {
            financing.printFinancingDetails(count);
            totalProperyAmount += financing.getPropertyAmount();
            totalFinancingAmount += financing.getTotalInterestRateYearly();
            count++;
        }

        // Exibindo o total de todos os imóveis e financiamentos
        System.out.printf("%nTotal de todos os imóveis: R$ %.2f%n", totalProperyAmount);
        System.out.printf("Total de todos os financiamentos: R$ %.2f%n", totalFinancingAmount);

        // Gerando relatório
        Report.report(financings, totalProperyAmount, totalFinancingAmount);
    }
}
