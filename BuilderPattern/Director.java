package BuilderPattern;

public class Director {

    ICarBuilder carBuilder;
    Director(ICarBuilder builder){
        this.carBuilder = builder;
    }


    // instructor
    public void constuct(boolean needEngine,boolean needTyre,boolean needBodyShell){
        if(needEngine){
            carBuilder.buildEngine();
        }

        if(needTyre){
            carBuilder.buildTyre();
        }
        
        carBuilder.buildChassis();
        
        if(needBodyShell){
            carBuilder.buildBodyShell();
        }
    }
    
}
