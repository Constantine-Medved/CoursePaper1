public class Employee {
    private String surname, name, patronymicName;
    private int salary;
    private int department;
    static private int counter;
    private final int id;
    public Employee (String surname, String name, String patronymicName, int salary, int department) {
        this.surname = surname;
        this.name = name;
        this.patronymicName = patronymicName;
        this.salary = salary;
        this.department = department;
        id = ++counter;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPatronymicName() {
        return patronymicName;
    }
    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "id " + id +" - " + surname + " " + name + " " + patronymicName + ", зарплата: " + salary + " рублей" + ", отдел: " + department;
    }
}
