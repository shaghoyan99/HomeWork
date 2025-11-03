package work.company.storage;

import work.company.models.PositionLevel;
import work.company.models.Employee;

public class EmployeeStorage {

    private Employee[] employees;
    private int size;

    public EmployeeStorage() {
        employees = new Employee[10];
    }

    public void addEmployee(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }

    public void print() {
        if (size != -1) {
            for (int i = 0; i < size; i++) {
                System.out.println(employees[i]);
            }
        } else {
            System.out.println("No employee added");
        }
    }

    public void searchEmployeeByIdCompany(String idCompony) {
        if (size != -1) {
            for (int i = 0; i < size; i++) {
                if (employees[i].getCompany().getIdCompany().equals(idCompony)) {
                    System.out.println(employees[i]);
                }
            }
        } else {
            System.out.println("No employee added");
        }
    }

    public void searchEmployeeByNameCompany(String nameCompany) {
        if (size != -1) {
            for (int i = 0; i < size; i++) {
                if (employees[i].getCompany().getName().equalsIgnoreCase(nameCompany)) {
                    System.out.println(employees[i]);
                }
            }
        } else {
            System.out.println("No employee added");
        }
    }

    public void searchEmployeeByPositionLevel(PositionLevel positionLevel) {
        if (size != -1) {
            for (int i = 0; i < size; i++) {
                if (employees[i].getPositionLevel().equals(positionLevel)) {
                    System.out.println(employees[i]);
                }
            }
        } else {
            System.out.println("No employee added");
        }
    }
}
