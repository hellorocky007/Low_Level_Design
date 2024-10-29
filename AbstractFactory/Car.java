package AbstractFactory;

import AbstractFactory.Models.IEngine;

public class Car {
    IEngine Iengine;

    IVehicleFactory carFactory;
    Car(IVehicleFactory factory){
        this.carFactory = factory;
    }

    public void driveCar(){
        Iengine = carFactory.createEngine();
        System.out.println("You Got the car");
        
    }
    
}
