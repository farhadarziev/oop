public class Laptop extends Device{
    private int ramSize;
    private double processorSpeed;

    public Laptop(String newName,double newPrice, int newStock, int newWarrantyPeriod,int newRamSize,double newProcessorSpeed){
        super(newName,newPrice,newStock,newWarrantyPeriod);
        ramSize=newRamSize;
        processorSpeed=newProcessorSpeed;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("RAM: "+ramSize + "GB");
        System.out.println("Processor Speed: "+processorSpeed + "GHz");
    }

    public void runProgram(String programName) {
        System.out.println(" running a program  " + programName + " on the laptop.");
    }

    public void useKeyboard() {
        System.out.println("Typing on the keyboard QWERTY");
    }

    @Override
    public String toString() {
        return super.toString() + ", RAM: " + ramSize + "GB, Processor Speed: " + processorSpeed + "GHz";
    }

}
