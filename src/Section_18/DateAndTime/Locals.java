package Section_18.DateAndTime;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Locals {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println("default locals = " +Locale.getDefault());

        Locale en = new Locale("en");
        Locale enAU = new Locale("en","AU");
        Locale enCA = new Locale("en","CA");

        Locale enIN = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        Locale enNZ = new Locale.Builder().setLanguage("en").setRegion("NZ").build();

        var dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        for (var Locale : List.of(
                Locale.getDefault(), Locale.US, en, enAU, enCA, Locale.UK, enNZ, enIN )){
            System.out.println(Locale.getDisplayName() + "=" + LocalDateTime.now().format(dtf.withLocale(Locale)));
        }

        DateTimeFormatter  wDayMonth = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");

        LocalDate May5 = LocalDate.of(2020,5,5);
        System.out.println("--------------------------------------------------------------");
        for (var locale : List.of(Locale.CANADA,
                Locale.CANADA_FRENCH, Locale.FRANCE, Locale.GERMANY, Locale.TAIWAN, Locale.JAPAN, Locale.ITALY)){
            System.out.println(locale.getDisplayName() + " : " +  locale.getDisplayName(locale) + " =\n\t "  +
                    May5.format(wDayMonth.withLocale(locale)));
            System.out.print(String.format(locale,"\t%1$tA,  %1$tB, %1$te, %1$tYY  %n",May5));

            NumberFormat decimalInnfo = NumberFormat.getNumberInstance(locale);
            decimalInnfo.setMaximumFractionDigits(6);
            System.out.println(decimalInnfo.format(123456789.123456));

            NumberFormat currency = NumberFormat.getCurrencyInstance(locale);
            Currency localCurrency = Currency.getInstance(locale);
            System.out.println(currency.format(555.555 ) + " [ " +
                    localCurrency.getCurrencyCode() + " ] " +
                    localCurrency.getDisplayName(locale) + " / " +
                    localCurrency.getDisplayName()
            );

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the loan amount = ");
            scanner.useLocale(Locale.UK);
            BigDecimal myLoan = scanner.nextBigDecimal();
            System.out.println("My Loan " + myLoan);
        }

    }
}
