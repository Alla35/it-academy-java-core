package by.it_academy.lesson11.Task2;

import java.util.ArrayList;
import java.util.Collection;

public class AverageSensor implements Sensor {
    private final Collection<Sensor> sensors = new ArrayList<>();

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        int sum = 0;
        int activeSensor = 0;
        for (Sensor sensor : sensors) {
            if (sensor.isOn()) {
                sum += sensor.read();
                activeSensor++;
            }
        }
        if (activeSensor == 0) {
            throw new IllegalStateException();
        }
        return sum / activeSensor;
    }

}


