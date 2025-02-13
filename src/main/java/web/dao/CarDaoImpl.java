package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("model1", 1, "user1", 2021));
        cars.add(new Car("model2", 2, "user2", 2022));
        cars.add(new Car("model3", 3, "user3", 2023));
        cars.add(new Car("model4", 4, "user4", 2024));
        cars.add(new Car("model5", 5, "user5", 2025));
    }

    @Override
    public List<Car> listCars(int count) {
        if (count == 0) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
