package pl.pawelnielepkowicz.reusingClasses;

/**
 * Created by Ja on 03/09/2015.
 */

class WaterSource {
    private String s;

    WaterSource(){

        System.out.println("WaterSource()");
        s = "Constructed";

    }

    public String toString() { return s; }

}



public class Composition {

    private String valve1;

    private WaterSource source = new WaterSource();

    public String toString() {
        return"valve1 = " + valve1 + " ";
    }


}
