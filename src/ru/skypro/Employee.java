package ru.skypro;

import java.util.Objects;

public class Employee {
    static int id = 0;
    String fIO;
    int department;
    float salary;

    public Employee(String fIO, int department, float salary) {
        Object id;
        this.fIO = fIO;
        this.department = department;
        this.salary = salary;
    }
    // int id = 1;
//     public Employee() {
//    }


    public String getfIO() {
        return fIO;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
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

