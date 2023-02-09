package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarService {

    private List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Civic", 2021));
        cars.add(new Car("Tesla", "Model 3", 2022));
        cars.add(new Car("Ford", "Mustang", 2019));
        cars.add(new Car("Chevrolet", "Corvette", 2018));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getCars(int count) {
        return cars.subList(0,count);
    }
}


