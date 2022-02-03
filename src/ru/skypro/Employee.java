package ru.skypro;

import java.util.Objects;

public class Employee {
    private int id = 0;
    private String fio;
    private int department;
    private float salary;
    private static int counter = 1;

        public Employee(String fio, int department, float salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        counter++;
    }

    public String getfio() {
        return fio;
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


    @Override
    public String toString() {
        return "Сотрудник {" +
                "id=" + id +
                ", ФИО = '" + fio + '\'' +
                ", Отдел = " + department +
                ", Зарплата = " + salary +
                " рублей}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Float.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(fio, employee.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, department, salary, id);
    }

}

