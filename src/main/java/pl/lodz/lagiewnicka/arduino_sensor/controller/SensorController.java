package pl.lodz.lagiewnicka.arduino_sensor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.lodz.lagiewnicka.arduino_sensor.model.SensorDto;
import pl.lodz.lagiewnicka.arduino_sensor.service.SensorService;

@RestController
@RequestMapping("/api/sensor/data")
public class SensorController {

    private final SensorService sensorService;

    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @PostMapping()
    public ResponseEntity<String> receiveData(@RequestBody SensorDto sensorDto) {
        // Set current time if not provided

        // Save data to the database
        sensorService.saveSensorData(sensorDto);

        // Return a response
        return ResponseEntity.ok("Data received and saved successfully.");
    }

    @GetMapping("/{hum}/{temp}")
    public ResponseEntity<String> receiveData(@PathVariable int hum, @PathVariable int temp) {
        System.out.println("Humidity " + hum + " Temperature " + temp);
        return ResponseEntity.ok("Data received and saved successfully.");
    }
}
