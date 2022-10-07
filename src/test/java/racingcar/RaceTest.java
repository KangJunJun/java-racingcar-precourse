package racingcar;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.Cars;
import racingcar.model.Race;
import racingcar.model.TryCount;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

public class RaceTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;
    private static Race race;

    @BeforeAll
    static void beforeAll() {
        Cars cars = new Cars("test1,test2");
        TryCount count = new TryCount("3");
        race = new Race(cars, count);
    }

    @Test
    @DisplayName("레이스 정보 입력")
    void input_Race_Info() {
        assertThat(race.getCars().get(0).getName().equals("test1")).isTrue();
        assertThat(race.getCount()).isEqualTo(3);
    }

    @Test
    @DisplayName("레이스 진행")
    void race_Run() {
        assertRandomNumberInRangeTest(
                () -> {
                    race.run();
                    assertThat(race.getCars().get(0).getDistance()).isEqualTo(1);
                    assertThat(race.getCars().get(1).getDistance()).isEqualTo(0);
                },
                MOVING_FORWARD, STOP
        );
    }
}
