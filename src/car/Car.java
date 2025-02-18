
package car;


public class Car {

    String Colour;
    int Engine_Power;
    boolean Convertible;
    boolean ParkingBrake;
    
    public Car(){};
    public Car(String Colour, int Engine_Power,boolean Convertible, boolean ParkingBrake){
        this.Colour = Colour;
        this.Convertible = Convertible;
        this.Engine_Power = Engine_Power;
        this.ParkingBrake = ParkingBrake;
    }
    
    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public void setEngine_Power(int Engine_Power) {
        this.Engine_Power = Engine_Power;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }
   
    public String getColour() {
        return Colour;
    }

    public int getEngine_Power() {
        return Engine_Power;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public boolean isParkingBrake() {
        return ParkingBrake;
    }
    
    public void pressStartButton(){
        System.out.println("You have press the start button");
    }
    
    public void pressAcceleratorButton(){
        System.out.println("You have press the Accelerator button");
    }
    
    public void OutPut(){
        System.out.println("Colour: " + Colour + "Engine_Power: " + Engine_Power + "Convertible: " + Convertible + "ParkingBrake: " + ParkingBrake );
    }
    
    
}
