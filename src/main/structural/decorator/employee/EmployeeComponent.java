package main.structural.decorator.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public interface EmployeeComponent {
    void showInfo();
    void join();

    void doTask();

    /*
        từ java 8 trở đi, interface có thể chứa default/static function
     */
    default Date convertStringToDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            System.out.println("Error when parsing from string to date!!");
            e.printStackTrace();
        }
        return null;
    }
}
