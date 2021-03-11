package main.structural.bridge;

import main.structural.bridge.accounts.CreditAccount;
import main.structural.bridge.accounts.SaveAccount;
import main.structural.bridge.banks.Agribank;
import main.structural.bridge.banks.Bank;
import main.structural.bridge.banks.VietcomBank;

public class BridgePattern {
    public static void main(String[] args) {
        Bank vietcombank = new VietcomBank(new SaveAccount());
        vietcombank.createBank();

        Bank agribank = new Agribank(new CreditAccount());
        agribank.createBank();
    }

    /*  Trong Java OOP, có hai khái niệm cốt lõi là trừu tượng (abstraction) và thực thi (implement) được kết nối với nhau
    thông qua quan hệ implement. Khi abstraction thay đổi, các implements cũng phải thay đổi theo.
        Về mặt lý thuyết, bridge được sử dụng để tách biệt hai phần trừu tượng và thực thi để giảm bớt sự phụ thuộc giữa chúng.

        Giả sử ta có một class OperationSystem cùng inteface ImageStore. (demo cách lưu trữ dữ liệu ảnh tại các hệ điều hành khác nhau)
        Hệ điều hành có các loại: Window, IOs, LinuxDis (total = 3)
        Image có các loại: png, gif, jpg, mpeg, tiff ... (total = 9)

        Nếu làm theo cách thông thường, ta sẽ tạo các class tương ứng: WindowPng, Window Gif, IOsMpeg, ...
        tổng cộng 3*9 = 27 class extend OperationSytem, implement ImageStore.

        Khi sử dụng Bridge design pattern, ta chỉ cần tạo 3 lớp extend OperationSytem, 9 lớp implements ImageStore và trong
        Operation chứa tham chiếu đến ImageStore. => tối ưu code, dễ dàng mở rộng.

        Ở đây ta chuyển việc xử lý logic trong các lớp WindowPng, Window Gif, IOsMpeg, ... (cách 1) , sang các lớp implements ImageStore (cách 2) .
     */
}
