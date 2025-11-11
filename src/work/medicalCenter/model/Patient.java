package work.medicalCenter.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Patient extends Person {

    private Doctor doctor;
    private LocalDateTime registerDateTime;

    public Patient(int id, String name, String surname, String phoneNumber, Doctor doctor) {
        super(id, name, surname, phoneNumber);
        this.doctor = doctor;
        this.registerDateTime = LocalDateTime.now();
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDateTime getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(LocalDateTime registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(doctor, patient.doctor) && Objects.equals(registerDateTime, patient.registerDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doctor, registerDateTime);
    }

    @Override
    public String toString() {
        return "Patient{" +
                super.toString() +
                "doctor=" + doctor +
                ", registerDateTime=" + registerDateTime +
                '}';
    }
}
