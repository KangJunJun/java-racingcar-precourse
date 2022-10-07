package racingcar.view;

public class Print {
    public static final String errorMark = "[Error] ";
    public static final String InputRequestTryCount = "시도할 회수는 몇인가요?";
    public static final String InputRequestName = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    public static void printError(String errorMsg) {
        System.out.println(errorMark + errorMsg);
    }

    public static void printInputRequestTryCount() {
        System.out.println(InputRequestTryCount);
    }
    public static void printInputRequestName() {
        System.out.println(InputRequestName);
    }
}
