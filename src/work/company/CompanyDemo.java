package work.company;

import work.company.exception.CompanyNotFoundException;
import work.company.models.Company;
import work.company.models.Employee;
import work.company.storage.CompanyStorage;
import work.company.storage.EmployeeStorage;

import java.util.Scanner;

public class CompanyDemo implements Commands {

    private static final CompanyStorage companyStorage = new CompanyStorage();
    private static final EmployeeStorage employeeStorage = new EmployeeStorage();
    private static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            Commands.commands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_COMPANY:
                    companyStorage.print();
                    break;
                case PRINT_ALL_EMPLOYEE:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_NAME:
                    getEmployeesByCompanyName();
                    break;
                case SEARCH_EMPLOYEE_BY_ID_COMPANY:
                    getEmployeesByCompanyId();
                    break;
            }
        }
    }

    private static void getEmployeesByCompanyName() {
        System.out.println("Please input Company Name ");
        companyStorage.print();
        String nameCompany = scanner.nextLine();
        employeeStorage.searchEmployeeByNameCompany(nameCompany);
    }

    private static void getEmployeesByCompanyId() {
        System.out.println("Please input Company ID ");
        companyStorage.print();
        String idCompany = scanner.nextLine();
        employeeStorage.searchEmployeeByIdCompany(idCompany);
    }


    private static void addCompany() {
        System.out.println("Please input Company name ");
        String name = scanner.nextLine();
        Company company = new Company(name);
        companyStorage.addCompany(company);
        System.out.println("Company was added !!!");
    }

    private static void addEmployee() {
        System.out.println("Please select Id Company");
        companyStorage.print();
        String idCompany = scanner.nextLine();
        Company company;
        try {
            company = companyStorage.getCompanyById(idCompany);
            System.out.println("Please input name ");
            String name = scanner.nextLine();
            System.out.println("Please input surname ");
            String surname = scanner.nextLine();
            System.out.println("Please input salary ");
            double salary = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input position ");
            String position = scanner.nextLine();
            Employee employee = new Employee(name, surname, salary, company, position);
            employeeStorage.addEmployee(employee);
            System.out.println("Employee was added !!!");
        } catch (CompanyNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
