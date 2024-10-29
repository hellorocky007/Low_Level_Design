package FactoryMethod;

import java.util.ArrayList;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        
        // ClassicScopio obj = new ClassicScopio();
        // obj.driveCar();
        // ScorpioN obj1 = new ScorpioN();
        // obj1.driveCar();

        // Factory obj = new Factory();
        // Scorpio C = obj.createFactory('C');
        // C.driveCar();

         List<Scorpio> car = new ArrayList<>();
        //  Scorpio car1 = new ClassicScopio();
        //  Scorpio car2  = new ScorpioN();
         car.add(new ScorpioN());
         car.add(new Scorpio());
         car.add(new ClassicScopio());
         for(Scorpio e : car){
            e.driveCar();
         }

    }
}
