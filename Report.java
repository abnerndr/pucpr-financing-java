import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Report {
    // Método para gerar o relatório
    public static void report(ArrayList<Financing> financings, double totalProperyAmount, double totalFinancingAmount) {
        String fileName = "financial_report.txt";
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(fileName))){
            buffer.write("Resumo dos Financiamentos:\n");
            int count = 1;
            for (Financing financing : financings) {
                buffer.write(financing.getFinancingDetails(count));
                buffer.newLine();
                count++;
            }
            buffer.write(String.format("Valor total dos imóveis: R$ %.2f", totalProperyAmount));
            buffer.newLine();
            buffer.write(String.format("Valor total financiado: R$ %.2f", totalFinancingAmount));
            buffer.newLine();
            System.out.println("Relatório gerado com sucesso!");
        } catch (IOException e) {
            // TODO: handle exception
            System.err.println("Error: " + e.getMessage());
        }
    }
}
