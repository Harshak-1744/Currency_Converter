import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to Currency Converter..");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Choose an option:");
            System.out.println("1. USD to INR");
            System.out.println("2. EUR to INR");
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println("1$ = 81.99 INR");
                    double conversionRateUSD = 81.99;

                    System.out.print("Enter amount in Dollars: ");
                    double dollars = scanner.nextDouble();

                    double indianRupeesUSD = dollars * conversionRateUSD;

                    NumberFormat currencyFormatterUSD = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
                    String formattedIndianRupeesUSD = currencyFormatterUSD.format(indianRupeesUSD);

                    System.out.println("Equivalent amount in Indian Rupees: " + formattedIndianRupeesUSD);
                    break;

                case 2:
                    System.out.println("1€ = 91.24 INR");
                    double conversionRateEUR = 91.24;

                    System.out.print("Enter amount in Euros: ");
                    double euros = scanner.nextDouble();

                    double indianRupeesEUR = euros * conversionRateEUR;

                    NumberFormat currencyFormatterEUR = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
                    String formattedIndianRupeesEUR = currencyFormatterEUR.format(indianRupeesEUR);

                    System.out.println("Equivalent amount in Indian Rupees: " + formattedIndianRupeesEUR);
                    break;

                default:
                    System.out.println("Invalid choice. Please select either 1 or 2.");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}
