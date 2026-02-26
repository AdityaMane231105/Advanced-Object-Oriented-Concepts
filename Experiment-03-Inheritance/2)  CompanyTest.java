class Employee {
    String name, address, jobTitle;
    double salary;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    double calculateBonus() {
        return salary * 0.10;
    }

    void performanceReport() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
    }

    void manageProject() {
        System.out.println(name + " is managing a project.");
    }
}

class Manager extends Employee {
    Manager(String n, String a, double s) {
        super(n, a, s, "Manager");
    }
}

class Developer extends Employee {
    Developer(String n, String a, double s) {
        super(n, a, s, "Developer");
    }
}

class Programmer extends Employee {
    Programmer(String n, String a, double s) {
        super(n, a, s, "Programmer");
    }
}

public class CompanyTest {
    public static void main(String[] args) {
        Manager m = new Manager("Aditya", "Kolhapur", 80000);
        Developer d = new Developer("Rahul", "Pune", 60000);
        Programmer p = new Programmer("Amit", "Mumbai", 50000);

        m.performanceReport();
        d.performanceReport();
        p.performanceReport();
    }
}
