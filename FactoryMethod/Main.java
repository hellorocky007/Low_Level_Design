package FactoryMethod;
public class Main {
    
    public static void main(String[] args) {

        
        // ClassicScopio obj = new ClassicScopio();
        // obj.driveCar();
        // ScorpioN obj1 = new ScorpioN();
        // obj1.driveCar();

        Factory obj = new Factory();
        Scorpio C = obj.createFactory('C');
        C.driveCar();
    }
}
