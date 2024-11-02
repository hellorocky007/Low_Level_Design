package BuilderPattern;

import BuilderPattern.Models.ICar;
import BuilderPattern.Models.Fortuner;

public class FortunorBuilder implements ICarBuilder {
    Fortuner s1;

    
    public void buildEngine(){
        System.out.println(" Fortunor Engine is inserted");
    }
    public void buildChassis(){
        System.out.println("Fortunor Chassis is inserted");
    }
    public void buildTyre(){
        System.out.println("Fortunor Tyre is inserted");
    }
    public void buildBodyShell(){
        System.out.println("Fortunor BodyShell is inserted");
    }

    public ICar build(){
        return s1;
    }
    
}
