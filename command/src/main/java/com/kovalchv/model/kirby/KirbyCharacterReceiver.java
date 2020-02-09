package com.kovalchv.model.kirby;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class KirbyCharacterReceiver {

    private String name;

    public void moveUp() {
        System.out.println(getName() + " moving up!");
    }

    public void moveLeft() {
        System.out.println(getName() + " moving left!");
    }

    public void moveRight() {
        System.out.println(getName() + " moving right!");
    }

    public void moveDown() {
        System.out.println(getName() + " moving down!");
    }

}
