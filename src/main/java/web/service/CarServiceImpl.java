package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    private List<Car> carsList = new ArrayList<>();;
    @Autowired
    public CarServiceImpl() {
        carsList.add(new Car("VIN111", "Toyota Corolla", 2020));
        carsList.add(new Car("VIN222", "Honda Civic", 2019));
        carsList.add(new Car("VIN333", "Ford Mustang", 2022));
        carsList.add(new Car("VIN444", "Chevrolet Camaro", 2021));
        carsList.add(new Car("VIN555", "BMW X5", 2023));
    }

    public void setCars(List<Car> cars) {
        this.carsList = cars;
    }

    @Override
    public List<Car> getCars() {
        return carsList;
    }
}
