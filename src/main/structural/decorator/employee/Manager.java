package main.structural.decorator.employee;

public class Manager extends DecoratorEmployee {
    public Manager(ConcreteEmployee concreteEmployee) {
        super(concreteEmployee);
    }

    private void createRequirement() {
        System.out.println("Manager is creating requirements ...");
    }

    private void assignTasks() {
        System.out.println("Manager is assigning tasks ...");
    }

    @Override
    public void doTask() {
        this.showInfo();
        this.join();
        this.createRequirement();
        this.assignTasks();
    }
}
