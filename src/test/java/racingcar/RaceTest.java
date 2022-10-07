package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.Cars;
import racingcar.model.Race;
import racingcar.model.TryCount;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceTest {
    @Test
    @DisplayName("레이스 정보 입력")
    void input_Race_Info() {
        Cars cars = new Cars("test1,test2");
        TryCount count = new TryCount("3");
        Race race = new Race(cars, count);
        assertThat(race.getCars().get(0).getName().equals("test1")).isTrue();
        assertThat(race.getCount()).isEqualTo(3);
    }
}
