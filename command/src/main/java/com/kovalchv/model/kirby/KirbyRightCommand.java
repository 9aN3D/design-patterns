package com.kovalchv.model.kirby;

import com.kovalchv.interfaces.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class KirbyRightCommand implements Command {

    private KirbyCharacterReceiver kirbyCharacter;

    @Override
    public void execute() {
        kirbyCharacter.moveRight();
    }

}
