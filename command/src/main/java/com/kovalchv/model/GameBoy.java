package com.kovalchv.model;

import com.kovalchv.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GameBoy {

    private Command upCommand;
    private Command downCommand;
    private Command leftCommand;
    private Command rightCommand;

    public void arrowUp() {
        upCommand.execute();
    }

    public void arrowDown() {
        downCommand.execute();
    }

    public void arrowLeft() {
        leftCommand.execute();
    }

    public void arrowRight() {
        rightCommand.execute();
    }

}
