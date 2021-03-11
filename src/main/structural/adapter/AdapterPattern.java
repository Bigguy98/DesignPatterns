package main.structural.adapter;

public class AdapterPattern {
    public static void main(String[] args) {
        VietnameseTarget target = new TranslateAdapter();
        target.send("Xin chào");
    }

    /*
        Adapter được sử dụng khi cần kết nối các interface không tương thích.
        Giả sử ta có hai interface A,B trong đó A cần gọi tới function của B.
        Thay vì sửa code trên hai interface A, B ta tạo một adapter mới C để hỗ trợ việc giao tiếp giữa chúng.

        Cụ thể, C (Adapter) sẽ implement interface A (Target) và tham chiều đến B (Adaptee) như một class field, trong override function sẽ gọi đến B.

        Trong các trường hợp hạn chế sửa code có sẵn (do ảnh hưởng đến nhiều class đã tồn tại, hoặc do interface A nằm trong
        thư viện, không sửa được) việc sử dụng Adapter trở nên vô cùng hữu ích.
     */
}
