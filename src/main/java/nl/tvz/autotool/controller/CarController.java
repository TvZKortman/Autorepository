package nl.tvz.autotool.controller;

import nl.tvz.autotool.entity.CarFactoryInfo;
import nl.tvz.autotool.repository.CarFactoryInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {


    private CarFactoryInfoRepository carFactoryInfoRepository;

    @Autowired
    public void setCarFactoryInfoRepository(CarFactoryInfoRepository carFactoryInfoRepository) {
        this.carFactoryInfoRepository = carFactoryInfoRepository;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/carfactory")
    public void setCarFactoryInfo(CarFactoryInfo carFactoryInfo){
       carFactoryInfoRepository.save(carFactoryInfo);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/carfactory")
    public List<CarFactoryInfo> getCarfactoryInfo(@RequestParam String automerk){
        return carFactoryInfoRepository.findCarFactoryInfoByAutomerk(automerk);
    }

}
