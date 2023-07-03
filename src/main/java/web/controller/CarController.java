package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class CarController {

	private CarService carService;
	@Autowired
	public CarController(CarService carService) {
		this.carService = carService;
	}
//	private static CarServiceImpl carService;

	@GetMapping(value = "/cars")
	public String printCars(@RequestParam(value = "count", defaultValue = "5") Integer param, ModelMap model) {
		List<Car> limitedCars = carService.getCars().stream()
				.limit(param)
				.collect(Collectors.toList());
		model.addAttribute("carsList", limitedCars);
		return "cars";
	}
}