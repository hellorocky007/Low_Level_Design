package AbstractFactory;

import AbstractFactory.Models.IEngine;
import AbstractFactory.Models.ScorpioEngine;

public class ScorpioFactory implements IVehicleFactory {
    public IEngine createEngine(){
        
        System.out.println("Creating Scorpio Engine");
        return new ScorpioEngine();
    }
}
