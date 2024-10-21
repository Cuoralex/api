package concessionaire.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import concessionaire.api.repository.CarRepository;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public void getCars() {
        carRepository.findAll();
    }
}
