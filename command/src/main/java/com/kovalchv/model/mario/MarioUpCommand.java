package com.kovalchv.model.mario;

import com.kovalchv.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MarioUpCommand implements Command {

    private MarioCharacterReceiver marioCharacter;

    @Override
    public void execute() {
        marioCharacter.moveUp();
    }

}
