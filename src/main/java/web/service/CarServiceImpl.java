package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars; {
        cars = new ArrayList<>();
        cars.add(new Car("TESLA", 1, 200));
        cars.add(new Car("BMW", 2, 250));
        cars.add(new Car("AUDI", 3, 300));
        cars.add(new Car("OPEL", 4, 350));
        cars.add(new Car("LADA", 5, 400));
    }

    @Override
    public List<Car> getList(int count) {
        if (count == 0 || count > 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
