package ru.skypro;

public class Main<getAvgSalary> {

    public static void main(String[] args) {
        Employee[] employeeStorage = new Employee[10];

        employeeStorage[0] = new Employee("Ivanov Ivan Ivanovi4", 1, 55_000);
        employeeStorage[1] = new Employee("Petrov Petr Petrovi4", 2, 66_666);
        employeeStorage[2] = new Employee("Vasiliev Vasya Vaseevi4", 3, 40_000);
        employeeStorage[3] = new Employee("Igorev Igor Igorevi4", 4, 111_000);
        employeeStorage[4] = new Employee("Olegov Oleg Olegovi4", 5, 20_000);
        employeeStorage[5] = new Employee("Ivanova Olga Petrovna", 1, 45_000);
        employeeStorage[6] = new Employee("Petrova Nastya Ivanovna", 2, 33_334);
        employeeStorage[7] = new Employee("Vasilievna Vera Nicolaevna", 3, 60_000);
        employeeStorage[8] = new Employee("Igorevna Nadya Semenovna", 4, 39_000);
        employeeStorage[9] = new Employee("Morozova Nika Dmitrievna", 5, 80_000);

        getFullList(employeeStorage); // Задание 8 A
        float getFullSalary = getFullSalary(employeeStorage); // Задание 8 B
        System.out.println("Сумма затрат на зарплаты в месяц = " + getFullSalary + " рублей"); // Задание 8 B
        getMinSalary(employeeStorage); // Задание 8 C
        getMaxSalary(employeeStorage); // Задание 8 D
        getAvgSalary(getFullSalary, employeeStorage); // Задание 8 E
        getFullFio(employeeStorage); // // Задание 8 F
    }

    public static void getFullList(Employee[] employeeStorage) {
        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными:");
        for (int i = 0; i < employeeStorage.length; i++) {
            employeeStorage[i].addID();
            System.out.println(employeeStorage[i]);
        }
    }

    public static float getFullSalary(Employee[] employeeStorage) {
        float sum = 0;
        for (int i = 0; i < employeeStorage.length; i++) {
            sum = sum + employeeStorage[i].getSalary();
        }
        return sum;

    }

    public static void getMinSalary(Employee[] employeeStorage) {
        float minSalary = employeeStorage[0].salary;
        int index = 0;
        for (int i = 0; i < employeeStorage.length; i++) {
            if (minSalary > employeeStorage[i].getSalary()) {
                minSalary = employeeStorage[i].getSalary();
                index = i;
            }
        }
        System.out.println(employeeStorage[index].fIO + " сотрудник с минимальной зарплатой = " + minSalary + " рублей");
    }

    public static void getMaxSalary(Employee[] employeeStorage) {
        float maxSalary = employeeStorage[0].salary;
        int index = 0;
        for (int i = 0; i < employeeStorage.length; i++) {
            if (maxSalary < employeeStorage[i].getSalary()) {
                maxSalary = employeeStorage[i].getSalary();
                index = i;
            }
        }
        System.out.println(employeeStorage[index].fIO + " сотрудник с максимальной зарплатой = " + maxSalary + " рублей");
    }

    public static void getAvgSalary(float getFullSalary, Employee[] employeeStorage) {
        float avgSalary = getFullSalary / employeeStorage.length;
        System.out.println("Средняя зарплата - " + avgSalary + " рублей");
    }

    public static void getFullFio(Employee[] employeeStorage) {
        System.out.println("Список всех сотрудников: ");
        for (int i = 0; i < employeeStorage.length; i++) {
            System.out.println(employeeStorage[i].getfIO());
        }
    }
}
