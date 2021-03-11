package main.structural.decorator;

import main.structural.decorator.employee.*;

public class DecoratorPattern {
    public static void main(String[] args) {
        ConcreteEmployee concreteEmployee = new ConcreteEmployee("Vu Thanh Tung", 23, "22/12/2019");

        EmployeeComponent teamMember = new TeamMember(concreteEmployee);
        teamMember.doTask();

        /* thăng cấp lên teamlead */
        EmployeeComponent teamlead = new TeamLead(concreteEmployee);
        teamlead.doTask();

        /* thăng cấp lên manager */
        EmployeeComponent manager = new Manager(concreteEmployee);
        manager.doTask();
    }

    /*
    Decorator Pattern được sử dụng để gán thêm trách nhiệm cho lớp đã tồn tại sẵn mà ko cần thay đổi code của nó.
    Điều này được thực hiện bằng cách tạo ra lớp wrapper, chứa tham chiếu đến lớp cần gán.

    Ở ví dụ này, lớp cần gán trách nhiệm là ConcreteEmployee chứa thông tin nhân viên.
    Một nhân viên có thể thăng chức lên TeamLead hay Manager, nếu làm theo cách thông thường ta cần tạo mới đối tượng TeamLead/Manger từ
    dữ liệu thông tin nhân viên TeamMember, rồi xóa TeamMember ==> cách làm này không được khuyến khích do quy trình khá củ chuối.
    Thay vào đó, khi sử dụng Decorator Pattern, ta chỉ cần gán đối tượng ConcreteEmployee từ TeamMember  -> TeamLead/Manager
     */

    /*
    Mấu chốt ở đây là việc tạo ra một đối tượng ConcreteEmployee chứa thông tin liên quan đến nhân viên, các thao tác mà nhân viên nào cũng cần
    làm (bất kể có là TeamMember, TeamLead hay Manager).
    Khi cần gán thêm trách nhiệm (bổ nhiệm, thăng cấp), ta chỉ cần gán ConcreteEmployee cho cấp tương ứng.
     */
}
