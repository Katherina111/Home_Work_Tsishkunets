package by.teachmeskills.inheritance.taskSecondEmployees;

public class Director implements Employees{
    private final String name;

    public Director(String name) {
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println(this.name);
    }
}