package main.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SoldierFactory {
    private static Map<String, ISoldier> map = new HashMap<>();

    public static ISoldier createSoldier(String type, Context context) {
        ISoldier soldier =  map.get(type);
        if(soldier == null) {
            // để thể hiện khác biệt rõ rệt về tốc độ khi khởi tạo nhiều đối tượng
            wait3Second();
            soldier = new Soldier(type);
            soldier.showInfo(context);
            map.put(type, soldier);
        }
        else {
            soldier.showInfo(context);
        }
        return soldier;
    }

    public static int getTotalSoldier() {
        return map.size();
    }

    private static void wait3Second() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
