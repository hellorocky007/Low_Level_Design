package BuilderPattern;

import BuilderPattern.Models.Scorpio;
import BuilderPattern.Models.ICar;

public class ScorpioBuilder implements ICarBuilder {

    Scorpio s1;
    public void buildEngine(){
        System.out.println(" Scorpio Engine is inserted");
    }
    public void buildChassis(){
        System.out.println("Scorpio Chassis is inserted");
    }
    public void buildTyre(){
        System.out.println("Scorpio Tyre is inserted");
    }
    public void buildBodyShell(){
        System.out.println("Scorpio BodyShell is inserted");
    }

    public ICar build(){

        System.out.println("Scorpio is Ready");
        return s1;
    }

}
