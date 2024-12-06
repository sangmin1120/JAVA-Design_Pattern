/*
파일 : BatteryLevelDisplay.java
생성 : 2024-11-29
내용 : concrete observer , 실제 observer 구현
 */
package observer.연습2;

public class BatteryLevelDisplay implements Observer {
    private Battery battery;

    public BatteryLevelDisplay(Battery battery) {
        this.battery = battery;
    }

    @Override
    public void update() {
        int level = battery.getLevel();
        System.out.println("level = " + level);
    }
}
