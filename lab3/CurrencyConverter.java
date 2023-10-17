package lab3;
import java.util.Scanner;
public class CurrencyConverter {
    private double usdExchangeRate; // Курс обмена USD к рублю
    private double eurExchangeRate; // Курс обмена EUR к рублю
    private double cnyExchangeRate; // Курс обмена CNY к рублю

    public CurrencyConverter(double usdExchangeRate, double eurExchangeRate, double cnyExchangeRate) {
        this.usdExchangeRate = usdExchangeRate;
        this.eurExchangeRate = eurExchangeRate;
        this.cnyExchangeRate = cnyExchangeRate;
    }

    // Метод для конвертации рублей в доллары
    public double convertToUSD(double rubles) {
        return rubles / usdExchangeRate;
    }

    // Метод для конвертации рублей в евро
    public double convertToEUR(double rubles) {
        return rubles / eurExchangeRate;
    }

    // Метод для конвертации рублей в юани
    public double convertToCNY(double rubles) {
        return rubles / cnyExchangeRate;
    }

    public static void main(String[] args) {
        // Пример использования
        CurrencyConverter converter = new CurrencyConverter(96.0, 103.0, 13.0); // Устанавливаем курсы обмена

        Scanner input = new Scanner(System.in);
        System.out.println("Сколько у вас рублей ?");
        double amountInRubles = input.nextDouble();
        double amountInUSD = converter.convertToUSD(amountInRubles);
        System.out.println(amountInRubles + " рублей = " + amountInUSD + " долларов");

        double amountInEUR = converter.convertToEUR(amountInRubles);
        System.out.println(amountInRubles + " рублей = " + amountInEUR + " евро");

        double amountInCNY = converter.convertToCNY(amountInRubles);
        System.out.println(amountInRubles + " рублей = " + amountInCNY + " юаней");
    }
}
