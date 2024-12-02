/*
파일 : Main.java
생성 : 2024-11-29
내용 : observer pattern 구현
 */
package observer.연습2;

public class Main {
    public static void main(String[] args) {
        // 1. 변경되는 객체 생성
        Battery battery = new Battery();

        // 2. 통보받는 클래스 생성
        Observer batteryLevelDisplay = new BatteryLevelDisplay(battery);
        Observer lowBatteryWarning = new LowBatteryWarning(battery);

        // 3. 연결
        battery.attach(batteryLevelDisplay);
        battery.attach(lowBatteryWarning);

        // 3. 출력
        battery.consume(30); // 100 -> 70
        battery.consume(50); // 70 -> 20
        battery.consume(10); // 20 -> 10
    }
}
