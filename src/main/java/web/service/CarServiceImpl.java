package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    private List<Car> carsList;

    public CarServiceImpl() {

    }
    @Autowired
    public CarServiceImpl(List<Car> cars) {
        carsList = cars;
    }
    public void setCars(List<Car> cars) {
        this.carsList = cars;
    }

    @Override
    public List<Car> getCars() {
        return carsList;
    }
}
