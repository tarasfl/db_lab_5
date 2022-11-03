package com.tfliorko.db_lab_5.service;

import com.tfliorko.db_lab_5.domain.DysneyPark;
import java.util.Optional;

public interface DysneyParkService extends GeneralService<DysneyPark, Integer>{

    Optional<DysneyPark> findByCity(String city);
}