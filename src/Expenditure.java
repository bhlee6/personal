import java.math.BigDecimal;
import java.util.ArrayList;

public class Expenditure {

    String name;
    BigDecimal total;
    ArrayList<Expenditure> subcategory;

    public Expenditure(String name, BigDecimal total) {
        this.name = name;
        this.total = total;
        this.subcategory = null;
    }

    public Expenditure(String name, BigDecimal total, ArrayList<Expenditure> subcategory) {
        this.name = name;
        this.total = total;
        this.subcategory = subcategory;
    }

    public String getTotal() {
        BigDecimal currentsum = new BigDecimal(total.toString());
        if (this.subcategory == null) {
            return this.total.toString();
        }
        else {
            for (Expenditure subexp: subcategory) {
                currentsum = currentsum.add(new BigDecimal(subexp.total.toString()));
            }
            return currentsum.toString();
        }
    }

    public static void main(String args[]) {
        Expenditure test = new Expenditure("test", new BigDecimal(10000));
        Expenditure test3 = new Expenditure("test3", new BigDecimal("1000"));
        Expenditure test2 = new Expenditure("test2", new BigDecimal(1), new ArrayList<Expenditure>());
        test2.subcategory.add(test);
        test2.subcategory.add(test3);

        System.out.println(test.name + " " + test.getTotal());
        System.out.println(test2.name + " " + test2.getTotal());
    }


}