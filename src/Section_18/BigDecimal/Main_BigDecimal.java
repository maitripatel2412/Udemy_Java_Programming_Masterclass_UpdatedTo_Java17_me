package Section_18.BigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;

public class Main_BigDecimal {

    public static void main(String[] args) {

        double policyAmount = 100_000_000;
        int beneficiaries = 3;
        float percentageFloat = 1.0f / beneficiaries;
        double percentageDouble = 1.0 / beneficiaries;

        System.out.printf("payout = %,.2f%n", policyAmount * percentageFloat);
        System.out.printf("payout = %,.2f%n", policyAmount * percentageDouble);

        double totalUsingFloat = policyAmount - ((policyAmount * percentageFloat) * beneficiaries);
        System.out.printf("totalUsingFloat = %,.2f%n", totalUsingFloat);

        double totalUsingDouble = policyAmount - ((policyAmount * percentageDouble) * beneficiaries);
        System.out.printf("totalUsingDouble = %,.2f%n", totalUsingDouble);

        String[] tests = {"15.456","8","10000.000001",".123"};
        BigDecimal[] bds = new BigDecimal[tests.length];
        Arrays.setAll(bds,i -> new BigDecimal(tests[i]));

        System.out.printf("%-14s %-15s %-8s %s%n","Value","UnscaledValue","Scale","Precision");

        for (var bd :bds){
            System.out.printf("%-15s %-15d %-8d %d %n",bd,bd.unscaledValue(),bd.scale(),bd.precision());

        }

        double[] doubles = {15.456,8,10000.000001,.123};
        Arrays.setAll(bds,i -> new BigDecimal(doubles[i]));
        System.out.println("-------------------------------------------");
        System.out.printf("%-14s %-15s %-8s %s%n","Value","UnscaledValue","Scale","Precision");

        for (var bd :bds){
            System.out.printf("%-15s %-15d %-8d %d %n",bd,bd.unscaledValue(),bd.scale(),bd.precision());
            bd.setScale(2, RoundingMode.HALF_UP);
            System.out.printf("%-15s %-15d %-8d %d %n",bd,bd.unscaledValue(),bd.scale(),bd.precision());
        }

        BigDecimal policyPayout = new BigDecimal("100e6");
        System.out.printf("%-15s %-15d %-8d %d %n",
                policyPayout,policyPayout.unscaledValue(),policyPayout.scale(),policyPayout.precision());

        BigDecimal percent = BigDecimal.ONE.divide(BigDecimal.valueOf(beneficiaries),
                new MathContext(60, RoundingMode.UP));
        System.out.println(percent);

        BigDecimal checkAmount = policyPayout.multiply(percent);
        System.out.printf("%.2f%n",checkAmount);
        System.out.printf("%-15s %-15d %-8d %d %n",
                checkAmount,checkAmount.unscaledValue(),checkAmount.scale(),checkAmount.precision());

        BigDecimal totalCheckAmount = checkAmount.multiply(BigDecimal.valueOf(beneficiaries));
        System.out.printf("Combines : %.2f%n", totalCheckAmount);
        System.out.printf("Remaining = " + policyPayout.subtract(totalCheckAmount));

        System.out.printf("%-15s %-15d %-8d %d %n",
                totalCheckAmount,totalCheckAmount.unscaledValue(),totalCheckAmount.scale(),totalCheckAmount.precision());


    }

}
