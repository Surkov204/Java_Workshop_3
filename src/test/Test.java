/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import car.Car;
public class Test {

    public static void main(String[] args) {
        Car c=new Car();
        c.pressStartButton();
        c.pressAcceleratorButton();
        c.OutPut();
        Car c2=new Car("red", 100, true, true);
        c2.pressAcceleratorButton();
        c2.setColour("black");
        System.out.println("Colour of c2:" + c2.getColour());
        c2.OutPut();
    }
    
}
