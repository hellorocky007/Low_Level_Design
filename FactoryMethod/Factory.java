package FactoryMethod;

public class Factory {
    
  public Scorpio createFactory(char ch){
    switch (ch) {
        case 'N': return new ScorpioN();
        case 'C':return new ClassicScopio();
        default: return new Scorpio();
           
    }
  } 
}
