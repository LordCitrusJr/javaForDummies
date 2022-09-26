public class PlaceToLive {
    private String address;
    private Integer numBedrooms;
    private Integer sqFeet;
    private Double sqfPrice;
    private Double estPropCost;
    private double costPerBedroom;

    public void setAddress(String a) { address = a; }

    public String getAddress() {return address; }

    public void setNumBedrooms( Integer n) { numBedrooms = n; }

    public Integer getNumBedrooms() { return numBedrooms; }

    public void setSqFeet(Integer s) { sqFeet = s; }

    public Integer getSqFeet() { return sqFeet; }

    public void setSqfPrice(Double p) { sqfPrice = p; }

    public Double getSqfPrice() { return sqfPrice; }

    public void setEstPropCost(Double e) { estPropCost = e; }

    public Double getEstPropCost() { return estPropCost; }

    public void setCostPerBedroom(Double c) { costPerBedroom = c; }

    public Double getCostPerBedroom() { return costPerBedroom; }

}
