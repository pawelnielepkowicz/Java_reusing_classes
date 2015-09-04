package pl.pawelnielepkowicz.reusingClasses;

/**
 * Created by Ja on 03/09/2015.
 */

class  Game {

    Game(int i){

        System.out.println("Game constructor plus argument: " + i);
    }

}

class BoardGame extends Game {

    BoardGame(int i){
        super(i);
        System.out.println("BoardGame constructor plus argument: " + i);
    }
}



public class InitWithArguments extends BoardGame {

    InitWithArguments(){

        super(11);
        System.out.println("InitWithArguments constructor plus argument: " + 11);

    }


}
