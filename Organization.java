import static java.lang.System.out;

public class Organization {
    String orgName;
    Integer orgRevenue;
    Boolean orgIsForProfit;

    public void display() {
        out.print(orgName);
        out.print(", Annual Revenue: ");
        out.print(orgRevenue);
        out.print(", Is a \"For Profit\" organization?: ");
        out.print(orgIsForProfit);

    }
    public double taxLiability(double taxRate) { return orgRevenue * taxRate / 100.00; } // This statement passes and returns the org's tax liability
}
