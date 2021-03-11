package main.structural.decorator.employee;

public class TeamMember extends DecoratorEmployee {

    public TeamMember(ConcreteEmployee concreteEmployee) {
        super(concreteEmployee);
    }

    private void performTask() {
        System.out.println("Team member performing task...");
    }
    private void corporateWithOther() {
        System.out.println("Team member corporating with others...");
    }

    @Override
    public void doTask() {
        this.showInfo();
        this.join();
        this.performTask();
        this.corporateWithOther();
    }
}
