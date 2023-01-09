package by.teachmeskills.inheritance.taskSecondEmployees;

public class EmployeeDemo {
    /*
    Employees
    Создать классы "Директор", "Рабочий", "Бухгалтер".
    Реализовать интерфейс с методом, который печатает название должности и
    имплементировать этот метод в созданные классы.
     */
    public static void main(String[] args) {
        Director director = new Director("Директор");
        director.printInfo();

        Worker worker = new Worker("Рабочий");
        worker.printInfo();

        Accountant accountant = new Accountant("Бухгалтер");
        accountant.printInfo();

    }
}
