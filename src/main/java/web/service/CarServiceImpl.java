package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    public List<Car> getCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("BMW", 5, 10000);
        Car car2 = new Car("volvo", 90, 20000);
        Car car3 = new Car("Lada", 99, 1000);
        Car car4 = new Car("Rover", 15, 30000);
        Car car5 = new Car("Jaguar", 10, 110000);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        List<Car> carList = new ArrayList<>();
        int i = 0;
        if (count == null) {
            return cars;
        } else if (count <= 5) {
            while (count != i) {
                carList.add(cars.get(i));
                i++;
            }
            return carList;
        }
        return cars;
    }
}

