public class Smartphone extends Device{
    private double Screensize;
    private int batteryLife;
    public Smartphone(String newName, double newPrice, int newStock, int newWarrantyPeriod, double newScreensize, int newBatteryLife) {
        super(newName, newPrice, newStock, newWarrantyPeriod);
        Screensize = newScreensize;
        batteryLife = newBatteryLife;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Screen size: " + Screensize + "inches");
        System.out.println("Battery life: " + batteryLife + "hours");
    }
    public void makeCall(){
        System.out.println("Making a call with "+ super.toString());
    }
    public void installApp(String appName){
        System.out.println("Installing app " + appName );
    }
    @Override
    public String toString() {
        return super.toString() + " Screen size: " + Screensize + "inches"+" battery life: " + batteryLife + " hours";
    }
}
