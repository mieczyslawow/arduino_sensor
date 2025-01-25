package pl.lodz.lagiewnicka.arduino_sensor.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "sensor_data")
@Data
public class SensorData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int temp;

    @Column(nullable = false)
    private int hum;

    @Column(nullable = false)
    private LocalDateTime dateTime;
}
