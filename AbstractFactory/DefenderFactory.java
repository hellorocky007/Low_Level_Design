package AbstractFactory;

import AbstractFactory.Models.DefenderEngine;
import AbstractFactory.Models.IEngine;

public class DefenderFactory implements IVehicleFactory{
    public IEngine createEngine(){
        System.out.println("Creating Defender Engine");
        return new DefenderEngine();
    }
}
