class Financing {
    private double propertyAmount;
    private int deadlineFinancing;
    private double interestRateYearly;

    // Construtor
    public Financing(double propertyAmount, int deadlineFinancing, double interestRateYearly) {
        this.propertyAmount = propertyAmount;
        this.deadlineFinancing = deadlineFinancing;
        this.interestRateYearly = interestRateYearly;
    }

    // calcula o valor da parcela mensal
    public double calculatePaymentMonthly() {
        double rateMonthly = interestRateYearly / 12;
        int totalMontlhy = deadlineFinancing * 12;
        return (propertyAmount / totalMontlhy) * (1 + rateMonthly);
    }

    // calcula o valor total pago
    public double calculateTotalAmountPaid() {
        double paymentMonthy = calculatePaymentMonthly();
        return paymentMonthy * deadlineFinancing * 12;
    }

    // getters
    public double getPropertyAmount() {
        return propertyAmount;
    }

    // getters
    public double getTotalInterestRateYearly() {
        double totalInterestRateYearly = calculatePaymentMonthly();
        return totalInterestRateYearly;
    }

    // formata saida para gerar relatorio
    public void printFinancingDetails(int number) {
        double totalAmount = calculateTotalAmountPaid();
        System.out.printf("Financiamento %d –imóvel: R$ %.2f, financiamento: R$ %.2f%n",
                number, propertyAmount, totalAmount);
    }

    // formata saida para gerar relatorio
    public String getFinancingDetails(int amount) {
        return String.format("Financiamento %d: Valor do imóvel: R$ %.2f, Valor total do financiamento: R$ %.2f, Taxa de juros anual: %.2f%%, Prazo: %d anos",
        amount, propertyAmount, calculateTotalAmountPaid(), interestRateYearly, deadlineFinancing);
    }
}