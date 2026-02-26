public class EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Aditya", "Mane", 25000);
        Employee emp2 = new Employee("Rahul", "Patil", 30000);

        System.out.println(emp1.getYearlySalary());
        System.out.println(emp2.getYearlySalary());

        emp1.giveRaise();
        emp2.giveRaise();

        System.out.println(emp1.getYearlySalary());
        System.out.println(emp2.getYearlySalary());
    }
}
