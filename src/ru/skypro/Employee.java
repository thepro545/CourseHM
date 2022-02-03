package ru.skypro;

import java.util.Objects;

public class Employee {
    static int id = 0;
    String fIO;
    int department;
    float salary;

        public Employee(String fIO, int department, float salary) {
        this.fIO = fIO;
        this.department = department;
        this.salary = salary;
//        this.id = getId(id);
    }

//-----------------------------------------
//    public Employee() {
//        this.employeeStorage = new EmployeeBook[10];
//    }
//
//    public void addEmployees(String fIO, int department, float salary) {
//        EmployeeBook newEmployee = new EmployeeBook(id, fIO, department, salary);
//        employeeStorage[size++] = newEmployee;
//        id++;
//    }
//
//    public void printAll() {
//        for (int i = 0; i < 3; i++) {
//            EmployeeBook employee = employeeStorage[i];
//            System.out.println(id + employee.getId() + ": " + employee.getfIO());
//        }
//    }
//-----------------------------------------------

    public String getfIO() {
        return fIO;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId(int id) {
        return id++;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static int addID() {
        return id++;
    }

    @Override
    public String toString() {
        return "Сотрудник {" +
                "id=" + id +
                ", ФИО = '" + fIO + '\'' +
                ", Отдел = " + department +
                ", Зарплата = " + salary +
                " рублей}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Float.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(fIO, employee.fIO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fIO, department, salary, id);
    }

}

