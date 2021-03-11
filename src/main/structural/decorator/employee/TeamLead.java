package main.structural.decorator.employee;

public class TeamLead extends DecoratorEmployee {

    public TeamLead(ConcreteEmployee concreteEmployee) {
        super(concreteEmployee);
    }

    private void plan() {
        System.out.println("Team lead is planing ...");
    }
    private void motivate() {
        System.out.println("Team lead is motivating ...");
    }
    private void monitor() {
        System.out.println("Team lead is monitoring ...");
    }

    @Override
    public void doTask() {
        this.showInfo();
        this.join();
        this.plan();
        this.motivate();
        this.monitor();
    }
}
