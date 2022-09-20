import static java.lang.System.out;

public class UseOrganization {
    public static void main(String[] args) {
        Organization orgXYZ;
        Organization orgABC;

        orgXYZ = new Organization();
        orgABC = new Organization();
        double forProfitRate = 10.00;
        double nonProfitRate = 7.00;

        orgXYZ.orgName = "Fidget Spinners Incorporated";
        orgXYZ.orgRevenue = 1000000;
        orgXYZ.orgIsForProfit = true;

        orgABC.orgName = "Publicsense for Public Interest";
        orgABC.orgRevenue = 575000;
        orgABC.orgIsForProfit = false;

        orgXYZ.display();
        out.print(", Tax Liability: " + orgXYZ.taxLiability(forProfitRate));
        out.println();
        orgABC.display();
        out.print(", Tax Liability: " + orgABC.taxLiability(nonProfitRate));
        out.println();
    }
}
