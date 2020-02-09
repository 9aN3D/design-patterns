package com.kovalchv.model.mario;

import com.kovalchv.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MarioRightCommand implements Command {

    private MarioCharacterReceiver marioCharacter;

    @Override
    public void execute() {
        marioCharacter.moveRight();
    }

}
