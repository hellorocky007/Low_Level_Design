package FactoryMethod;

import Method.ScopiroClassicBodyShell;
import Method.ScorpioClassicEngine;

public class ClassicScopio extends Scorpio{

    public void makeScorpio(){
        System.out.println("Inside the Scorpio Classic");
        this.engine = new ScorpioClassicEngine();
        this.bodyShell = new ScopiroClassicBodyShell();
    }
    public void driveCar(){
        makeScorpio();
        System.out.println("Drive the Classic Scorpio");
    }
    
}
