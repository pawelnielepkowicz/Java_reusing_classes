package pl.pawelnielepkowicz.reusingClasses;

/**
 * Created by Ja on 03/09/2015.
 */

class Plate {

    Plate(String argPlate) {

        System.out.println("class Plate constructor + argument:" + argPlate);
    }

}

class SmallPlate extends Plate {

    SmallPlate(String argPlate) {
        super(argPlate);
        System.out.println("class SmallPlate constructor + argument:" + argPlate);
    }

}

// Dlaczego to sie samo inicuje?
class Custom {
    Custom(int i) {
        System.out.println("Custom constructor");
    }
}


public class CompositionInheritance extends Custom {

    private Plate Pl;
    private SmallPlate Sp;

    public CompositionInheritance(int i) {

        super(i + 1);

Pl = new Plate("Plate Arg" + i);
Sp = new SmallPlate("SmallPlate args" + i);

    }


}


