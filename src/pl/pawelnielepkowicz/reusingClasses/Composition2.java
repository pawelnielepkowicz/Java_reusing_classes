package pl.pawelnielepkowicz.reusingClasses;

/**
 * Created by Ja on 03/09/2015.
 */

class Engine {

    public void start() {
        System.out.println("Engine start");
    }

    public void stop() {
        System.out.println("Engine stop");
    }

}

class Window {

    public void up() {
        System.out.println("Window up");
    }

    public void down() {
        System.out.println("Window down");
    }
}

class Door{

    public Window leftWindow = new Window();
    public Window rightWindow = new Window();

    public void open() {
        System.out.println("Door open");
    }
    public void close() {
        System.out.println("Door close");
    }
    // dlaczego to nie dziala??
   // rightWindow.open();

}


public class Composition2 {

    public Engine myEngine = new Engine();
    public  Door leftDoor = new Door();
    public  Door rightDoor = new Door();


}
