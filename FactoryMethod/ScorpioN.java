package FactoryMethod;

import Method.ScorpioNBodyShell;
import Method.ScorpioNEngine;

public class ScorpioN extends Scorpio {

   public void makeScorpio(){
      System.out.println("Inside the Scorpio N");
      this.engine = new ScorpioNEngine();
      this.bodyShell = new ScorpioNBodyShell();
   }
   public void driveCar(){
      makeScorpio();
    System.out.println("Drive the Scorpio N");
   } 
}
