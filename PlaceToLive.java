public class PlaceToLive {
    private String address;
    private Integer numBedrooms;
    private Integer sqFeet;

    private Double sqfPrice;

    public void setAddress(String a) {
        address = a;
    }

    public String getAddress() {
        return address;
    }

    public void setNumBedrooms( Integer n) { numBedrooms = n; }

    public Integer getNumBedrooms() { return numBedrooms; }

    public void setSqFeet(Integer s) { sqFeet = s; }

    public Integer getSqFeet() { return sqFeet; }

    public void setSqfPrice(Double p) { sqfPrice = p; }

    public Double getSqfPrice() { return sqfPrice; }

}
