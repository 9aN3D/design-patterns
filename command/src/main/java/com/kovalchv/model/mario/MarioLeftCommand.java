package com.kovalchv.model.mario;

import com.kovalchv.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MarioLeftCommand implements Command {

    private MarioCharacterReceiver marioCharacter;

    @Override
    public void execute() {
        marioCharacter.moveLeft();
    }

}
