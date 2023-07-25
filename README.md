**Currency Converter**

This Java program, `Currency_Converter`, allows users to convert between Dollars (USD) or Euros (EUR) to Indian Rupees (INR) using predefined conversion rates. The program prompts the user to select the currency they want to convert and then input the amount. The converted amount is displayed in Indian Rupees using a currency format.

**How to Use:**

1. Make sure you have Java installed on your system.
2. Compile the `Currency_Converter.java` file using a Java compiler.
3. Run the compiled program with `java Currency_Converter`.
4. Follow the on-screen instructions to input the currency type and amount you want to convert.
5. The program will display the equivalent amount in Indian Rupees.

**Example Usage:**

```
$ javac Currency_Converter.java
$ java Currency_Converter

Hello! Welcome to Currency_converter..
Please select the currency to convert:
1. USD (US Dollars)
2. EUR (Euros)
Enter the corresponding number: 1

1$ = 81.99 INR
Enter amount in Dollars: 50
Equivalent amount in Indian Rupees: ₹4,099.50
```

**Notes:**

1. The conversion rates are predefined and might not be up-to-date or accurate in real-time. Please verify the rates before making any financial decisions.
2. The program uses the `NumberFormat` class to format the output of the converted amounts into the Indian Rupee currency format (e.g., ₹4,099.50).
3. The program uses the `Scanner` class to read user input. Make sure to input valid numerical values to avoid errors.


