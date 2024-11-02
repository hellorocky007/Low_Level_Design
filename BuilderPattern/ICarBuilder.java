package BuilderPattern;
import BuilderPattern.Models.ICar;

public interface ICarBuilder {

    public void buildEngine();
    public void buildChassis();
    public void buildTyre();
    public void buildBodyShell();

    //It will return the final Object

    public ICar build();
    
}
