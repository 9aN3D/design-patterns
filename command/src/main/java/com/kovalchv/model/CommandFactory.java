package com.kovalchv.model;

import com.kovalchv.interfaces.Command;
import com.kovalchv.model.kirby.KirbyCharacterReceiver;
import com.kovalchv.model.kirby.KirbyDownCommand;
import com.kovalchv.model.kirby.KirbyLeftCommand;
import com.kovalchv.model.kirby.KirbyRightCommand;
import com.kovalchv.model.kirby.KirbyUpCommand;
import com.kovalchv.model.mario.MarioCharacterReceiver;
import com.kovalchv.model.mario.MarioDownCommand;
import com.kovalchv.model.mario.MarioLeftCommand;
import com.kovalchv.model.mario.MarioRightCommand;
import com.kovalchv.model.mario.MarioUpCommand;
import lombok.AllArgsConstructor;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

import static java.util.Optional.ofNullable;

@AllArgsConstructor
public class CommandFactory {

    private final MarioCharacterReceiver mario = new MarioCharacterReceiver("Mario");
    private final KirbyCharacterReceiver kirby = new KirbyCharacterReceiver("Kirby");

    private final Map<String, Supplier<Command>> factoryMap = Map.of(
            "MarioUp", () -> bind(MarioUpCommand::new, mario),
            "MarioDown", () -> bind(MarioDownCommand::new, mario),
            "MarioLeft", () -> bind(MarioLeftCommand::new, mario),
            "MarioRight", () -> bind(MarioRightCommand::new, mario),
            "KirbyUp", () -> bind(KirbyUpCommand::new, kirby),
            "KirbyDown", () -> bind(KirbyDownCommand::new, kirby),
            "KirbyLeft", () -> bind(KirbyLeftCommand::new, kirby),
            "KirbyRight", () -> bind(KirbyRightCommand::new, kirby)
    );

    private static <T, R> R bind(Function<T, R> function, T value) {
        return function.apply(value);
    }

    public Command createCommand(String type) {
        Optional<Command> command = ofNullable(factoryMap.get(type).get());

        return command.orElseThrow(
                () -> new IllegalArgumentException("No such shape " + type));
    }

}
