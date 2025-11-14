package work.medicalCenter.model;

import work.medicalCenter.util.DateUtil;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Patient extends Person implements Serializable {

    private Doctor doctor;
    private Date registerDateTime;

    public Patient(int id, String name, String surname, String phoneNumber, Doctor doctor) {
        super(id, name, surname, phoneNumber);
        this.doctor = doctor;
        this.registerDateTime = new Date();
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Date registerDateTime) {
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
        return "Patient {" +
                super.toString() +
                " doctor= " + doctor +
                ", registerDateTime=" + DateUtil.fromDateToStr(registerDateTime) +
                '}';
    }
}
