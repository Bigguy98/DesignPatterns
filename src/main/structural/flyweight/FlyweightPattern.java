package main.structural.flyweight;

public class FlyweightPattern {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ISoldier bowman1 = SoldierFactory.createSoldier("bowman", new Context(3, 10));
        ISoldier bowman2 = SoldierFactory.createSoldier("bowman", new Context(4, 12));
        ISoldier bowman3 = SoldierFactory.createSoldier("bowman", new Context(5, 7));

        ISoldier fighter1 = SoldierFactory.createSoldier("fighter", new Context(6, 2));
        ISoldier fighter2 = SoldierFactory.createSoldier("fighter", new Context(7, 9));
        ISoldier fighter3 = SoldierFactory.createSoldier("fighter", new Context(8, 8));
        ISoldier fighter4 = SoldierFactory.createSoldier("fighter", new Context(1, 17));
        long endTime = System.currentTimeMillis();
        System.out.println("total time: " + (endTime - startTime));
    }
}

/*
    flyweight pattern được sử dụng khi cần tạo nhiều object của cùng một class, trong đó các object có một vài thuộc tính
    phi trạng thái (stateless - giá trị của thuộc tính là như nhau với tất cả object).
    Khi đó ta sẽ tách class thông thường ra làm 2 phần:
        - phần shared: chứa các thuộc tính stateless, các thuộc tính này sẽ được dùng chung
        - phần unshared: chứa các thuộc tính statefull

    cấu trúc của flyweight design pattern bao gồm các phần chính:
        - flyweight factory: chứa map để lưu trữ các shared instances (ISoldierFactory)
        - sharedFlyweight (Soldier)
        - unsharedFlyweight (Context)
 */