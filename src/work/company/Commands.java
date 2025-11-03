package work.company;

public interface Commands {
    String EXIT = "0";
    String ADD_COMPANY = "1";
    String ADD_EMPLOYEE = "2";
    String PRINT_ALL_COMPANY = "3";
    String PRINT_ALL_EMPLOYEE = "4";
    String SEARCH_EMPLOYEE_BY_ID_COMPANY = "5";
    String SEARCH_EMPLOYEE_BY_COMPANY_NAME = "6";
    String SEARCH_EMPLOYEES_BY_POSITION_LEVEL = "7";

    String JUNIOR = "1";
    String MIDDLE = "2";
    String SENIOR = "3";
    String LEAD = "4";

     static void printMainMenu() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + ADD_COMPANY + " for added company");
        System.out.println("Please input " + ADD_EMPLOYEE + " for added employee");
        System.out.println("Please input " + PRINT_ALL_COMPANY +" for print all company");
        System.out.println("Please input " + PRINT_ALL_EMPLOYEE +" for print all employee");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_ID_COMPANY + " for search employee by ID company");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_COMPANY_NAME + " for search employee by name company");
        System.out.println("Please input " + SEARCH_EMPLOYEES_BY_POSITION_LEVEL + " for search employee by position level");
    }

    static void printPositionLevelMenu() {
        System.out.println("Please select position level ");
        System.out.println("Please input " + JUNIOR + " for Junior");
        System.out.println("Please input " + MIDDLE + " for Middle");
        System.out.println("Please input " + SENIOR + " for Senior");
        System.out.println("Please input " + LEAD + " for Lead");
    }


}
