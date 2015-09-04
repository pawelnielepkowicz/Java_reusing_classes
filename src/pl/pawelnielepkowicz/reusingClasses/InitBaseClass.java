package pl.pawelnielepkowicz.reusingClasses;

/**
 * Created by Ja on 03/09/2015.
 */


// Constructor calls during inheritance.

class Art {
    Art() {  System.out.println("Art constructor"); }
}
class Drawing extends Art {
    Drawing() {  System.out.println("Drawing constructor"); }
}


public class InitBaseClass extends Drawing  {
    public InitBaseClass() {  System.out.println("Cartoon constructor"); }

}
