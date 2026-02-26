class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String fName, String lName, double salary) {
        firstName = fName;
        lastName = lName;
        if (salary > 0)
            monthlySalary = salary;
        else
            monthlySalary = 0.0;
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double salary) {
        if (salary > 0)
            monthlySalary = salary;
        else
            monthlySalary = 0.0;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise() {
        monthlySalary = monthlySalary + (monthlySalary * 0.10);
    }
}
