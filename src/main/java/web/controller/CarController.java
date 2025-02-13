package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
//    public String printCar() {
    public String printCar(@RequestParam(value = "count") Optional<Integer> count, Model model) {
//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car("model1", 1, "user1", 2021));
//        cars.add(new Car("model2", 2, "user2", 2022));
//        cars.add(new Car("model3", 3, "user3", 2023));
//        cars.add(new Car("model4", 4, "user4", 2024));
//        cars.add(new Car("model5", 5, "user5", 2025));

//        model.addAttribute("cars: ", cars);

        model.addAttribute("cars", carService.listCars(count.orElse(0)));
        return "cars";
    }
}
