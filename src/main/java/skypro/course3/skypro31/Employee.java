package skypro.course3.skypro31;

public class Employee {
    private String name;
    private String surname;
    private String fullName;
    private int department;
    private double salary;
    private final int id;
    static int countId = 0;

    public Employee(String name, String surname, int department, double salary) {
        this.name = name;
        this.surname = surname;
        this.fullName = name + " " + surname;
        this.department = department;
        this.salary = salary;
        this.id = countId++;
    }
    public Employee(String name, String surname, int department) {
        this.name = name;
        this.surname = surname;
        this.fullName = name + " " + surname;
        this.department = department;
        this.id = countId++;
    }
    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.fullName = name + " " + surname;
        this.id = countId++;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getFullName() {
        return fullName;
    }
    public int getDepartment() {
        return department;
    }
    public double getSalaryInfo() {
        return salary;
    }
    public int getId() {
        return countId;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Имя: " + fullName + ", отдел: " + department + ", зарплата: " + salary;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
//\