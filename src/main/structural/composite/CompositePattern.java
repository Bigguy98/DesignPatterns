package main.structural.composite;

public class CompositePattern {
    public static void main(String[] args) {
        Storage file1 = new File("D:/subject/math", 200);
        Storage file2 = new File("D:/subject/sience", 265);
        Storage file3 = new File("D:/subject/history", 1000);
        Storage file4 = new File("D:/subject/chemistry", 300);

        Storage subjectFolder = new Folder(new Storage[] {file1, file2, file3, file4});

        subjectFolder.showProperty();
        System.out.println("Folder size: " + subjectFolder.totalSize());
    }
    /*
        CompositePattern được sử dụng khi đối tượng đơn lẻ và một nhóm đối tượng có chung các hành vi (behavior).
        Ví dụ ở đây: file và folder (gồm một nhóm các file) đều có các function: showProperty và totalSize;
        Composite sẽ tổng hợp các đối tượng theo cấu trúc cây.
        File: Leaf (đối tượng cấp thấp nhất, thực hiện các thao tác của function)
        Folder sẽ đóng vai trò là Composite (đối tượng lưu trữ), các override function được thực hiện bằng cách ủy quyền cho Leaf hoặc
        composite cấp thấp hơn.
     */

}
