package racingcar.model;

import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class Race {
    private final Cars cars;
    private final TryCount count;

    public Race(Cars cars, TryCount count) {
        this.cars = cars;
        this.count = count;
    }

    public List<Car> getCars() {
        return this.cars.getCars();
    }

    public int getCount() {
        return this.count.getCount();
    }

    public void run() {
        for(Car car : this.cars.getCars()){
            car.move(getRandomNumber());
        }
    }

    private int getRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
