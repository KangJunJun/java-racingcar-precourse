package racingcar.controller;

import racingcar.model.Cars;
import racingcar.model.Race;
import racingcar.model.TryCount;

import static racingcar.view.Input.*;
import static racingcar.view.Print.*;

public class Racing {

    public void start(){
        Race race = new Race(inputName(), inputCount());
    }

    private Cars inputName(){
        try {
            return new Cars(inputCarNames());
        }
        catch (IllegalArgumentException e){
            printError(e.getMessage());
            return inputName();
        }
    }

    private TryCount inputCount(){
        try {
            return new TryCount(inputTryCount());
        }
        catch (IllegalArgumentException e){
            printError(e.getMessage());
            return inputCount();
        }
    }

}


