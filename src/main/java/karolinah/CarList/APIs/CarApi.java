package karolinah.CarList.APIs;

import karolinah.CarList.object.Car;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car")

public class CarApi {
    private List<Car> carList;

    public CarApi() {
        this.carList = new ArrayList<Car>();
    }

    @PostMapping("/addCar")
    public boolean addCar(@RequestBody Car mobi) {
        return carList.add(mobi);
    }

    @GetMapping("/getCar")
    public List<Car> getCarList() {
        return carList;
    }
}