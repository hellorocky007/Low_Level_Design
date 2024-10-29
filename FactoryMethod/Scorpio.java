package FactoryMethod;
import Method.IBodyShell;
import Method.IEngine;
import Method.ScorpioBodyShell;
import Method.ScorpioEngine;

public class Scorpio {

    IEngine engine;
    IBodyShell bodyShell;
    public void makeScorpio(){
        System.out.println("Inside the Scorpio");
        this.engine = new ScorpioEngine();
        this.bodyShell = new ScorpioBodyShell();
    }

    public void driveCar(){
        makeScorpio();
        System.out.println("Drive the normal Scorpio");
    }
    
}
