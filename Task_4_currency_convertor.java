import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//import java.util.spi.CurrencyNameProvider;
public class Task_4_currency_convertor {
    private Map<String,Double> exchangeRates;

    public Task_4_currency_convertor(){

        exchangeRates= new HashMap<>();
        exchangeRates.put("US Dollar",1.0);
        exchangeRates.put("Euro", 0.86);
        exchangeRates.put("Great British Pound", 0.74);
        exchangeRates.put("Japanese Yen", 109.78);
        exchangeRates.put("Canadian Dollar", 1.26);
        exchangeRates.put("Australian Dollar", 1.35);
        exchangeRates.put("Indian Rupee", 73.92);
        exchangeRates.put("Chinese yuan", 6.44);
    }

    public double convertCurrency(double amount,String fromCurrency,String toCurrency)
    {
        if(exchangeRates.containsKey(fromCurrency) && exchangeRates.containsKey(toCurrency)){
            double fromRate=exchangeRates.get(fromCurrency);
            double toRate=exchangeRates.get(toCurrency);
            return amount*(toRate/fromRate);
        }
        else
        {
            System.out.println("Sorry...\nInvalid currency codes.");
            return -1.0;

        }
    }
    public static void main(String[] args)
    {
        Task_4_currency_convertor convertor=new Task_4_currency_convertor();
        Scanner sc=new Scanner(System.in);

        System.out.println("Currency Convertor");
        System.out.println("Enter the amount or Value: ");
        double amount =sc.nextDouble();

        System.out.println("Enter the Source Currency Code (e.g. USD):");
        String fromCurrency= sc.next().toUpperCase();

        System.out.println("Enter the Target Currency Code (e.g.. EUR):");
        String toCurrency=sc.next().toUpperCase();

        double converted_Amount= convertor.convertCurrency(amount,fromCurrency,toCurrency);

        if(converted_Amount!= -1.0)
        {
            System.out.println(amount +" " + fromCurrency + " is equal to " + converted_Amount + " " + toCurrency);
            System.out.println("Thank you");
        }
    }
}
