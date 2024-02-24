import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Simple class to split bills.
 */

public class BillSplitting {
    private final List<String> creditCards;
    private final Float finalPrice;

    public BillSplitting(String finalPrice, String creditCards) {
        this.creditCards = new ArrayList<String>(Arrays.asList(creditCards.split(",")));
        this.finalPrice = Float.valueOf(finalPrice);
    }

    private Float calculateEqualShare() {
        return finalPrice / creditCards.size();
    }

    public static void main(String[] args) {
        System.out.println("Final Price: " + args[0]);
        System.out.println("Credit card list: " + args[1]);
        BillSplitting splitBill = new BillSplitting(args[0], args[1]);
        System.out.println("Individual Price: " + splitBill.calculateEqualShare());
    }
}