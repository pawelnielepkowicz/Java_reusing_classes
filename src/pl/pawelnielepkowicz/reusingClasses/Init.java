package pl.pawelnielepkowicz.reusingClasses;

/**
 * Created by Ja on 03/09/2015.
 */
public class Init {

    Init() {

    }


    public static void main(String[] args) {

        Composition sprinklers = new Composition();
        System.out.println(sprinklers);

        Bath b = new Bath();
        b.toSstring();



        // nie dziala !!
        Inheritance c = new Inheritance();

        c.dilute();
        c.apply();
        c.scrub();
        c.foam();

        new InitBaseClass();

        Cleanser h = new Cleanser();
        h.fsdd();

        new InitWithArguments();
        new BoardGame(22);

        new CompositionInheritance(3);

        Composition2 car = new Composition2();
        car.leftDoor.open();

        Door door = new Door();
        door.close();

    }


}
