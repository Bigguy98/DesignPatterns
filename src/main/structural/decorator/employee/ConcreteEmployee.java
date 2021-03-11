package main.structural.decorator.employee;

import java.util.Date;



public class ConcreteEmployee implements EmployeeComponent {
    private String name;
    private Integer age;
    private Date joinedDate;

    public ConcreteEmployee(String name, Integer age, String joinedDate) {
        this.name = name;
        this.age = age;
        this.joinedDate = convertStringToDate(joinedDate);
    }

    @Override
    public void showInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ConcreteEmployee Information{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", joinedDate=" + joinedDate +
                '}';
    }

    @Override
    public void join() {
        System.out.println("Joined company from: " + this.joinedDate);
    }

    @Override
    public void doTask() {
        // do nothing
    }

}
