/*
파일 : FloorDisplay.java
생성 : 2024-11-18
내용 : ConcreteObserver
 */
package observer.연습1;

public class FloorDisplay implements Observer{
    private ElevatorController controller;

    public FloorDisplay(ElevatorController controller) {
        this.controller = controller;
    }

    @Override
    public void update() {
        int curFloor = controller.getFloor();
        System.out.println("Floor Display = " + curFloor);
    }
}
