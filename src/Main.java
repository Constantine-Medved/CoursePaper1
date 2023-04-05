public class Main {
    private static Employee[] employeeData = new Employee[10];
    public static void displayEmployeesList() {
        System.out.println("==========> Список всех сотрудников компании: ");
        for (Employee index : employeeData) {
            System.out.println(index);
        }
    }
    public static void displayEmployeesFullNames() {
        System.out.println("==========> Ф.И.О. всех сотрудников компании: ");
        for (Employee index : employeeData) {
            System.out.println(index.getSurname() + " " + index.getName() + " " + index.getPatronymicName());
        }
    }
    public static double sumSalary() {
        double sum = 0;
        for (Employee index : employeeData) {
            sum += index.getSalary();
        }
        return sum;
    }
    public static void minSalary() {
        int index = 0;
        for (int i = 1; i < employeeData.length; i++) {
            if (employeeData[index].getSalary() > employeeData[i].getSalary())
                index = i;
        }
        System.out.println(employeeData[index]);
    }
    public static void maxSalary() {
        int index = 0;
        for (int i = 1; i < employeeData.length; i++) {
            if (employeeData[index].getSalary() < employeeData[i].getSalary())
                index = i;
        }
        System.out.println(employeeData[index]);
    }
    public static double averageSalary() {
        return (sumSalary() / employeeData.length);
    }
    public static void main(String[] args) {
        employeeData[0] = new Employee("Медведь", "Константин", "Александрович", 20_000, 1);
        employeeData[1] = new Employee("Колосов", "Алексей", "Андреевич", 100_000, 2);
        employeeData[2] = new Employee("Сергеев", "Дмитрий", "Иванович", 100_000, 2);
        employeeData[3] = new Employee("Страхова", "Оксана", "Анатольевна", 80_000, 3);
        employeeData[4] = new Employee("Бущик", "Святослав", "Дмитриевич", 120_000, 4);
        employeeData[5] = new Employee("Соколова", "Анна", "Сергеевна", 70_000, 3);
        employeeData[6] = new Employee("Дятел", "Олег", "Борисович", 90_000, 4);
        employeeData[7] = new Employee("Свидригайлов", "Лев", "Глебович", 200_000, 5);
        employeeData[8] = new Employee("Бобриков", "Николай", "Николаевич", 160_000, 3);
        employeeData[9] = new Employee("Стадникова", "Вероника", "Романовна", 130_000, 5);
        //НИЖЕ ПРОВЕРКА СЕТТЕРОВ
        employeeData[2].setSalary(10000); //Понижена зарплата сотруднику Сергееву Д.И.
        employeeData[3].setSurname("Смелая");// Замена Фамилии:  Страхова Оксана Анатольена  вышла замуж и теперь она Смелая Оксана Анатольена
        employeeData[6].setName("Ольга");// Дятел Олег Борисович сменил пол и имя на Ольга
        employeeData[6].setPatronymicName("Борисовна");// Дятел Олег Борисович сменил пол и теперь отчество Борисовна
        employeeData[5].setDepartment(1);// Перевод в другой отдел Соколовой А.С. из отдела "3" переведена в отдел "1"
        //НИЖЕ РЕАЛИЗАЦИЯ ПОСТАВЛЕННЫХ ЗАДАЧ:
        // a. Получить список всех сотрудников со всеми имеющимися по ним данными.
        displayEmployeesList();
        // b. Посчитать сумму затрат на зарплаты в месяц.
        System.out.println("==========> Сумма затрат на зарплаты в месяц: " + sumSalary() + " рублей");
        // c. Найти сотрудника с минимальной зарплатой.
        System.out.println("==========> Минимальная зарплата у сотрудника:");
        minSalary();
        // d. Найти сотрудника с максимальной зарплатой.
        System.out.println("==========> Максимальная зарплата у сотрудника:");
        maxSalary();
        // e. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
        System.out.println("==========> Средняя зарплата сотрудников " + averageSalary());
        // f. Получить Ф. И. О. всех сотрудников (вывести в консоль).
        displayEmployeesFullNames();
        // Вызываем Геттеры в рамках проверки всех полей : узать персональный Id и в каком отделе работает сотрудник Свидригайлов Л.Г.
        System.out.println("==========> Свидригайлов Лев Глебович : Id - " + employeeData[7].getId() + "; отдел " + employeeData[7].getDepartment() );
    }
}