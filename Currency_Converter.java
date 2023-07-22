import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency_Converter
{
    public static void main(String[] args) 
    {
        System.out.println("Hello! Welcome to Currency_converter..");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        
        switch(number)
        {
            case 1:
                System.out.println("1$ = 81.99 INR");
                double conversionRate = 81.99;

                System.out.print("Enter amount in Dollars: ");
                double indianRupees = scanner.nextDouble();

        
                double dollars = indianRupees * conversionRate; 

        
                NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

        
                String formattedDollars = currencyFormatter.format(dollars);

                System.out.println("Equivalent amount in IndianRupees: " + formattedDollars);
            
            break;
            
            case 2:
                System.out.println("1€ = 91.24 INR");
                double C_Rate = 91.24;
                
                System.out.print("Enter amount in Euros: " );
                double I_R = scanner.nextDouble();
                
                double euros = I_R * C_Rate;
                NumberFormat c_Formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
                String formattedEuros = c_Formatter.format(euros);
            
                System.out.println("Equivalent amount in IndianRupees: " + formattedEuros);
                
            break;
        }
                    

    scanner.close();
    }
}
