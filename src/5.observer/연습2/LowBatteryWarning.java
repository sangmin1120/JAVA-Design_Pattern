/*
파일 : LowBatteryWarning.java
생성 : 2024-11-29
내용 : concrete observer , 실제 observer 구현
 */
package observer.연습2;

public class LowBatteryWarning implements Observer{
    private int LOW_BATTERY = 30;
    private Battery battery;

    public LowBatteryWarning(Battery battery) {
        this.battery = battery;
    }

    @Override
    public void update() {
        int level = battery.getLevel();

        if (level < LOW_BATTERY) {
            System.out.println("<Warning> Low Battery = " + level);
        }
    }
}
