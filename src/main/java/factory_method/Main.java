package main.java.factory_method;

public class Main {


    public static void main(String[] args) {
        Bank bank = BankFactory.createBank(BankType.VIETCOMBANK);
        System.out.println(bank.getBankName() + " with interest rate: " + bank.getInterestRate());
    }

    /*
    Chúng ta có một super class với nhiều class con và dựa trên đầu vào, chúng ta cần trả về một class con.
    Mô hình này giúp chúng ta đưa trách nhiệm của việc khởi tạo một lớp từ phía người dùng (client) sang lớp Factory.
    Chúng ta không biết sau này sẽ cần đến những lớp con nào nữa.
    Khi cần mở rộng, hãy tạo ra sub class và implement thêm vào factory method cho việc khởi tạo sub class này.
     */
}
