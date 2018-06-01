package nl.tvz.autotool.repository;


import nl.tvz.autotool.entity.CarFactoryInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CarFactoryInfoRepository extends CrudRepository<CarFactoryInfo, String> {

    List<CarFactoryInfo> findCarFactoryInfoByAutomerk(String automerk);


}
