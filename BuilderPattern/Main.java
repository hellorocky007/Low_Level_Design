package BuilderPattern;

import BuilderPattern.Models.ICar;

public class Main {

    public static void main(String[] args) {
        ICarBuilder builder = new ScorpioBuilder();
        Director director = new Director(builder);

        // Direction Given by The director
        director.constuct(false,true,false);

        ICar car = builder.build();
        
    }
    
}
