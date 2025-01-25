package pl.lodz.lagiewnicka.arduino_sensor.service;

import org.springframework.stereotype.Service;
import pl.lodz.lagiewnicka.arduino_sensor.model.SensorData;
import pl.lodz.lagiewnicka.arduino_sensor.model.SensorDto;
import pl.lodz.lagiewnicka.arduino_sensor.repository.SensorRepository;

import java.time.LocalDateTime;

@Service
public class SensorService {

    private final SensorRepository sensorRepository;

    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public void saveSensorData(SensorDto sensorData) {
        SensorData entity = new SensorData();
        entity.setTemp(sensorData.temp());
        entity.setHum(sensorData.hum());
        entity.setDateTime(LocalDateTime.now());
        sensorRepository.save(entity);
    }
}
