package by.teachmeskills.inheritance.taskSecondEmployees;

public class Worker implements Employees{
    private final String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println(this.name);
    }
}
