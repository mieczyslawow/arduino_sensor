package pl.lodz.lagiewnicka.arduino_sensor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lodz.lagiewnicka.arduino_sensor.model.SensorData;

@Repository
public interface SensorRepository extends JpaRepository<SensorData, Long> {
}
