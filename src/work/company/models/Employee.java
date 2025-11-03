package work.company.models;

import java.util.Objects;

public class Employee {

    private String name;
    private String surname;
    private double salary;
    private Company company;
    private PositionLevel positionLevel;

    public Employee(String name, String surname, double salary, Company company, PositionLevel positionLevel) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.company = company;
        this.positionLevel = positionLevel;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public PositionLevel getPositionLevel() {
        return positionLevel;
    }

    public void setPositionLevel(PositionLevel positionLevel) {
        this.positionLevel = positionLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(company, employee.company) && positionLevel == employee.positionLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, salary, company, positionLevel);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", company=" + company +
                ", positionLevel=" + positionLevel +
                '}';
    }
}
