public class Tablet extends Device{
    private String screenResolution;
    private double weight;

    public Tablet(String newName,double newPrice, int newStock, int newWarrantyPeriod, String newScreenResolution, double newWeight) {
        super(newName, newPrice, newStock, newWarrantyPeriod);
        screenResolution = newScreenResolution;
        weight = newWeight;
    }
     @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Screen Resolution: " + screenResolution);
        System.out.println("Weight: " + weight + "grams");
    }
    public void browseInternet(String website) {
        System.out.println("Opening website: " + website + " on the tablet.");
    }

    public void useTouchscreen() {
        System.out.println(" using the touchscreen for navigation.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Screen Resolution: " + screenResolution + ", Weight: " + weight + " grams";
    }

}
