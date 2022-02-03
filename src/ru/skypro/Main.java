package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Employee[] employeeStorage = new Employee[10];

        employeeStorage[0] = new Employee("Ivanov Ivan Ivanovi4", 2, 55_000);
        employeeStorage[1] = new Employee("Petrov Petr Petrovi4", 2, 66_666);
        employeeStorage[2] = new Employee("Vasiliev Vasya Vaseevi4", 3, 40_000);
        employeeStorage[3] = new Employee("Igorev Igor Igorevi4", 4, 111_000);
        employeeStorage[4] = new Employee("Olegov Oleg Olegovi4", 5, 20_000);
        employeeStorage[5] = new Employee("Ivanova Olga Petrovna", 2, 45_000);
        employeeStorage[6] = new Employee("Petrova Nastya Ivanovna", 2, 33_334);
        employeeStorage[7] = new Employee("Vasilievna Vera Nicolaevna", 3, 60_000);
        employeeStorage[8] = new Employee("Igorevna Nadya Semenovna", 4, 39_000);
        employeeStorage[9] = new Employee("Morozova Nika Dmitrievna", 5, 80_000);

//        getFullList(employeeStorage); // Задание 8 A
//        float fullSalary = getFullSalary(employeeStorage); // Задание 8 B
//        System.out.println("Сумма затрат на зарплаты в месяц = " + fullSalary + " рублей"); // Задание 8 B
//        getMinSalary(employeeStorage); // Задание 8 C
//        getMaxSalary(employeeStorage); // Задание 8 D
//        getAvgSalary(fullSalary, employeeStorage); // Задание 8 E
//        getFullFio(employeeStorage); // Задание 8 F
//        indexSalary(employeeStorage); // Increased difficulty Задание 1
        int numOfDepartment = 1;
//        findEmployeeDepartment(numOfDepartment, employeeStorage);  // Поиск по отделу
//        getDepMinSalary(numOfDepartment, employeeStorage); // Increased difficulty Задание 2 A
//        getDepMaxSalary(numOfDepartment, employeeStorage); // Increased difficulty Задание 2 B
//        getDepFullSalary(numOfDepartment, employeeStorage); // Increased difficulty Задание 2 C
        float depFullSalary = getDepFullSalary(numOfDepartment, employeeStorage); // Increased difficulty Задание 2 C
//        System.out.println(depFullSalary + " - Сумма затрат на зарплату по отделу # " + numOfDepartment); // Increased difficulty Задание 2 C
//        getDepAvgSalary(depFullSalary, numOfDepartment, employeeStorage); // Increased difficulty Задание 2 D
        float percent = 20;
//        indexDepSalary(percent, numOfDepartment, employeeStorage); // Increased difficulty Задание 2 E
//        getDepFullList(numOfDepartment, employeeStorage); // Increased difficulty Задание 2 F
        float salaryForEquals = 50_000;
//        getNumMinSalary(salaryForEquals, employeeStorage); // Increased difficulty Задание 3 A
//        getNumMaxSalary(salaryForEquals, employeeStorage); // Increased difficulty Задание 3 B
    }

    public static void getFullList(Employee[] employeeStorage) {
        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными:");
        for (int i = 0; i < employeeStorage.length; i++) {
            try {
                if (employeeStorage[i] != null) {
                    System.out.println(employeeStorage[i]);
                }
            } catch (NullPointerException e) {
                throw new NullPointerException("Сотрудник не инициализирован");
            }
        }
    }

    public static float getFullSalary(Employee[] employeeStorage) {
        float sum = 0;
        for (int i = 0; i < employeeStorage.length; i++) {
            try {
                if (employeeStorage[i] != null) {
                    sum = sum + employeeStorage[i].getSalary();
                }
            } catch (NullPointerException e) {
                throw new NullPointerException("Сотрудник не инициализирован");
            }
        }
        return sum;

    }

    public static void getMinSalary(Employee[] employeeStorage) {
        float minSalary = employeeStorage[0].getSalary();
        int index = 0;
        for (int i = 0; i < employeeStorage.length; i++) {
            try {

            if (minSalary > employeeStorage[i].getSalary()) {
                minSalary = employeeStorage[i].getSalary();
                index = i;
            }
        }catch (NullPointerException e) {
                throw new NullPointerException("Сотрудник не инициализирован");
            }return;
        }
        System.out.println(employeeStorage[index].getfio() + " сотрудник с минимальной зарплатой = " + minSalary + " рублей");
    }

    public static void getMaxSalary(Employee[] employeeStorage) {
        float maxSalary = employeeStorage[0].getSalary();
        int index = 0;
        for (int i = 0; i < employeeStorage.length; i++) {
            try {
                if (maxSalary < employeeStorage[i].getSalary()) {
                    maxSalary = employeeStorage[i].getSalary();
                    index = i;
                }
            } catch (NullPointerException e) {
                throw new NullPointerException("Сотрудник не инициализирован");
            }
            return;
        }
        System.out.println(employeeStorage[index].getfio() + " сотрудник с максимальной зарплатой = " + maxSalary + " рублей");
    }

    public static void getAvgSalary(float fullSalary, Employee[] employeeStorage) {
        int count = 0;
        for (int i = 0; i < employeeStorage.length; i++) {
            try {
                if (employeeStorage[i] != null) {
                    count++;
                }
            } catch (NullPointerException e) {
                throw new NullPointerException("Сотрудник не инициализирован");
            }
        }
        float avgSalary = fullSalary / count;
        System.out.println("Средняя зарплата - " + avgSalary + " рублей");

    }

    public static void getFullFio(Employee[] employeeStorage) {
        System.out.println("Список всех сотрудников: ");
        for (int i = 0; i < employeeStorage.length; i++) {
            try {
                if (employeeStorage[i] != null) {
                    System.out.println(employeeStorage[i].getfio());
                }
            } catch (NullPointerException e) {
                throw new NullPointerException("Сотрудник не инициализирован");
            }


        }
    }

    public static void indexSalary(Employee[] employeeStorage) {
        float percent = 10;
        float temp;
        for (int i = 0; i < employeeStorage.length; i++) {
            try {
                if (employeeStorage[i] != null) {
                    temp = employeeStorage[i].getSalary();
                    temp = temp * (1 + (percent / 100));
                    employeeStorage[i].setSalary(temp);
                }
            } catch (NullPointerException e) {
                throw new NullPointerException("Сотрудник не инициализирован");
            }

        }

    }

    public static void findEmployeeDepartment(int numOfDepartment, Employee[] employeeStorage) {
        boolean check = false;
        for (int i = 0; i < employeeStorage.length; i++) {
            try {
                if (employeeStorage[i] != null && numOfDepartment == employeeStorage[i].getDepartment()) {
                    System.out.println(employeeStorage[i].getDepartment() + " отдел: " + employeeStorage[i].getfio());
                    check = true;
                }
            } catch (NullPointerException e) {
                throw new NullPointerException("Сотрудник не инициализирован");
            }
        }
        if (check == false){
            System.out.println("Сотрудники отсутствуют в отделе № " + numOfDepartment);
        }

    }

    public static void getDepMinSalary(int numOfDepartment, Employee[] employeeStorage) {
        boolean check = false;
        float minSalary = 200_000;
        int index = 0;
        for (int i = 0; i < employeeStorage.length; i++) {
            try {
                if (employeeStorage[i] != null && numOfDepartment == employeeStorage[i].getDepartment()) {
                    if (minSalary > employeeStorage[i].getSalary()) {
                        minSalary = employeeStorage[i].getSalary();
                        index = i;
                        check = true;
                    }
                }
            } catch (NullPointerException e) {
                throw new NullPointerException("Сотрудник не инициализирован");
            }

        }
        if (check == false){
            System.out.println("Сотрудники отсутствуют в отделе № " + numOfDepartment);
        }
        if (check == true){
            System.out.println(employeeStorage[index].getfio() + " сотрудник с минимальной зарплатой = " + minSalary + " рублей из отдела № " + numOfDepartment);
        }
    }

    public static void getDepMaxSalary(int numOfDepartment, Employee[] employeeStorage) {
        boolean check = false;
        float minSalary = 0;
        int index = 0;
        for (int i = 0; i < employeeStorage.length; i++) {
            try {
                if (employeeStorage[i] != null && numOfDepartment == employeeStorage[i].getDepartment()) {
                    if (minSalary < employeeStorage[i].getSalary()) {
                        minSalary = employeeStorage[i].getSalary();
                        index = i;
                        check = true;
                    }
                }
            } catch (NullPointerException e) {
                throw new NullPointerException("Сотрудник не инициализирован");
            }
        }
        if (check == false){
            System.out.println("Сотрудники отсутствуют в отделе № " + numOfDepartment);
        }
        if (check == true) {
            System.out.println(employeeStorage[index].getfio() + " сотрудник с максимальной зарплатой = " + minSalary + " рублей из отдела № " + numOfDepartment);
        }
    }

    public static float getDepFullSalary(int numOfDepartment, Employee[] employeeStorage) {
        float sum = 0;
        for (int i = 0; i < employeeStorage.length; i++) {
            try {
                if (employeeStorage[i] != null && numOfDepartment == employeeStorage[i].getDepartment()) {
                    sum = sum + employeeStorage[i].getSalary();
                }
            } catch (NullPointerException e) {
                throw new NullPointerException("Сотрудник не инициализирован");
            }
        }
        return sum;

    }

    public static void getDepAvgSalary(float depFullSalary, int numOfDepartment, Employee[] employeeStorage) {
        int count = 0;
        for (int i = 0; i < employeeStorage.length; i++) {
            try {
                if (employeeStorage[i] != null && numOfDepartment == employeeStorage[i].getDepartment()) {
                    count++;
                }
            }catch (NullPointerException e) {
                throw new NullPointerException("Сотрудник не инициализирован");
            }
        }
        float avgSalary = depFullSalary / count;
        System.out.println("Средняя зарплата - " + avgSalary + " рублей по отделу № " + numOfDepartment);
    }

    public static void indexDepSalary(float percent, int numOfDepartment, Employee[] employeeStorage) {
        float temp;
        for (int i = 0; i < employeeStorage.length; i++) {
            try {
            if (employeeStorage[i] != null && numOfDepartment == employeeStorage[i].getDepartment()) {
                temp = employeeStorage[i].getSalary();
                temp = temp * (1 + (percent / 100));
                employeeStorage[i].setSalary(temp);
            }
            }catch (NullPointerException e) {
                throw new NullPointerException("Сотрудник не инициализирован");
            }return;
        }
    }

    public static void getDepFullList(int numOfDepartment, Employee[] employeeStorage) {
        boolean check = false;
        System.out.println("Список всех сотрудников из отдела № " + numOfDepartment);
        for (int i = 0; i < employeeStorage.length; i++) {
            try {
                if (employeeStorage[i] != null && numOfDepartment == employeeStorage[i].getDepartment()) {
                    System.out.println("Сотрудник {id = " + employeeStorage[i].getId()+ ", ФИО = " + employeeStorage[i].getfio() + ", Зарплата = " + employeeStorage[i].getSalary() + "}");
                    check = true;
                }
            }catch (NullPointerException e) {
                throw new NullPointerException("Сотрудник не инициализирован");
            }
        }
        if (check == false){
            System.out.println("Сотрудники отсутствуют в отделе № " + numOfDepartment);
        }
    }

    public static void getNumMinSalary(float salaryForEquals, Employee[] employeeStorage) {
        System.out.println("Список сотрудников с запрлатой меньше " + salaryForEquals);
        for (int i = 0; i < employeeStorage.length; i++) {
            try {
                if (employeeStorage[i] != null && salaryForEquals > employeeStorage[i].getSalary()) {
                    System.out.println(employeeStorage[i].toString());
                }
            } catch (NullPointerException e) {
                throw new NullPointerException("Сотрудник не инициализирован");
            }
        }
    }

    public static void getNumMaxSalary(float salaryForEquals, Employee[] employeeStorage) {
        System.out.println("Список сотрудников с запрлатой больше " + salaryForEquals);
        for (int i = 0; i < employeeStorage.length; i++) {
            try {
                if (employeeStorage[i] != null && salaryForEquals <= employeeStorage[i].getSalary()) {
                System.out.println(employeeStorage[i].toString());
            }
        }catch (NullPointerException e) {
                throw new NullPointerException("Сотрудник не инициализирован");
            }
        }
    }
}
