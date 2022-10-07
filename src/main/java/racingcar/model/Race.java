package racingcar.model;

import java.util.List;

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
}
