import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency_Converter 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello! Welcome to Currency_converter..");
        Scanner scanner = new Scanner(System.in);

        System.out.println("1$ = 82.0925 INR");
        double conversionRate = 82.0925;

        System.out.print("Enter amount in Indian Rupees: ");
        double indianRupees = scanner.nextDouble();

        
        double dollars = indianRupees * conversionRate;

        
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.getDefault());

        
        String formattedDollars = currencyFormatter.format(dollars);

        System.out.println("Amount in Dollars: " + formattedDollars);

    scanner.close();
    }
}
