package racingcar.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Input {
    public static final String inputMessage = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)\n";

    public static String inputCarNames() {
        System.out.print(inputMessage);
        return readLine();
    }
}
