package main.structural.decorator.employee;

import java.util.Date;


/*
    must be abstract class because function doTask() not implement yet
 */
public abstract class DecoratorEmployee implements EmployeeComponent {

    private ConcreteEmployee concreteEmployee;

    public DecoratorEmployee(ConcreteEmployee concreteEmployee) {
        this.concreteEmployee = concreteEmployee;
    }

    @Override
    public void showInfo() {
        this.concreteEmployee.showInfo();
    }

    @Override
    public void join() {
        this.concreteEmployee.join();
    }


}
