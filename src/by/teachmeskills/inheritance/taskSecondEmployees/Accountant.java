package by.teachmeskills.inheritance.taskSecondEmployees;

public class Accountant implements Employees{
    private final String name;

    public Accountant(String name) {
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println(this.name);
    }
}
