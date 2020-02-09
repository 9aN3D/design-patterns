package com.kovalchv;

import com.kovalchv.model.CommandFactory;
import com.kovalchv.model.GameBoy;

public class Main {

    public static void main(String... args) {

        //Create commands
        CommandFactory commandFactory = new CommandFactory();

        //Invoker
        GameBoy marioGameBoy = new GameBoy(
                commandFactory.createCommand("MarioUp"),
                commandFactory.createCommand("MarioDown"),
                commandFactory.createCommand("MarioLeft"),
                commandFactory.createCommand("MarioRight"));

        marioGameBoy.arrowDown();
        marioGameBoy.arrowUp();
        marioGameBoy.arrowLeft();
        marioGameBoy.arrowRight();

        GameBoy kirbyGameBoy = new GameBoy(
                commandFactory.createCommand("KirbyUp"),
                commandFactory.createCommand("KirbyDown"),
                commandFactory.createCommand("KirbyLeft"),
                commandFactory.createCommand("KirbyRight"));

        kirbyGameBoy.arrowDown();
        kirbyGameBoy.arrowUp();
        kirbyGameBoy.arrowLeft();
        kirbyGameBoy.arrowRight();

    }

}
