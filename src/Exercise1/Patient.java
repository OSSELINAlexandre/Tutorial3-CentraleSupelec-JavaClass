package Exercise1;

import java.util.ArrayList;

public class Patient {
    private String name;
    private ArrayList<Blood> measurement;

    public Patient(String name) {
        this.name = name;
        measurement = new ArrayList<>();
    }

    public void addBlood_measure(Blood measure){
        measurement.add(measure);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Blood> getMeasurement() {
        return measurement;
    }

    public void setMeasurement(ArrayList<Blood> measurement) {
        this.measurement = measurement;
    }
}
