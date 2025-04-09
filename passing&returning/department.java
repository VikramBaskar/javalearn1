import java.util.Scanner;

class Employee {
    int id;
    String name;

    Employee(int i, String s) {
        id = i;
        name = s;
    }
}

class Department {
    static Employee hire() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Id: ");
        int id = scn.nextInt();
        scn.nextLine(); // Clear buffer
        System.out.println("Enter name: ");
        String name = scn.nextLine();
        return new Employee(id, name);
    }

    static void employeeDetails(Employee emp) {
        System.out.println("Id: " + emp.id);
        System.out.println("Name: " + emp.name);
    }

    public static void main(String[] args) {
        Employee e1 = Department.hire();
        Department.employeeDetails(e1);
    }
}
