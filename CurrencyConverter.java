import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get Rates (Assuming fixed rates for simplicity)
        double usdToEurRate = 0.85;
        double usdToGbpRate = 0.72;
        double usdToInrRate = 73.50; // Assuming 1 USD = 73.50 INR

        // Enter Amount
        System.out.print("💵 Enter the amount in USD: $");
        double amountInUsd = scanner.nextDouble();

        // Convert Currency
        double amountInEur = convertCurrency(amountInUsd, usdToEurRate);
        double amountInGbp = convertCurrency(amountInUsd, usdToGbpRate);
        double amountInInr = convertCurrency(amountInUsd, usdToInrRate);

        // See Result
        displayResult(amountInUsd, "USD", amountInEur, "EUR", amountInGbp, "GBP", amountInInr, "INR");

        scanner.close();
    }

    private static double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }

    private static void displayResult(double amount1, String currency1,
                                      double amount2, String currency2,
                                      double amount3, String currency3,
                                      double amount4, String currency4) {
        System.out.println("\n Conversion Result:");
        System.out.printf("%.2f %s is equivalent to %.2f %s%n", amount1, currency1, amount2, currency2);
        System.out.printf("%.2f %s is equivalent to %.2f %s%n", amount1, currency1, amount3, currency3);
        System.out.printf("%.2f %s is equivalent to %.2f %s%n", amount1, currency1, amount4, currency4);
    }
}
