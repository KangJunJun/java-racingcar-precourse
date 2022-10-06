package racingcar.controller;

import racingcar.model.Cars;
import static racingcar.view.Input.*;
import static racingcar.view.Print.*;

public class Racing {

    public void start(){
        inputName();
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
}


