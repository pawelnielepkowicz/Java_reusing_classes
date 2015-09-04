package pl.pawelnielepkowicz.reusingClasses;

/**
 * Created by Ja on 03/09/2015.
 */

class Soap {

    private String s;

    Soap() {

        System.out.println("Soap constructor");
        s = "Constructed";

    }

    String toSString() {
        return s;
    }

}


public class Bath {

    // Initializing at point of definition:
    String s1 = "Happy";
    String s2;
    private Soap castille;
    float toy;


    public Bath() {

        System.out.println("Bath constructor");
        s2 = "Beton";
        toy = 1321;

        castille = new Soap();

    }
     public   void toSstring(){
            System.out.println(

                    "s1 = " + s1 + "\n" +
                            "s2 = " + s2 + "\n" +
                            "toy = " + toy + "\n" +
                            "castille = " + castille
            );



    }
}
