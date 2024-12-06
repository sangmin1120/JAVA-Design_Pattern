/*
파일 : ControlRoomDisplay.java
생성 : 2024-11-18
내용 : ConcreteObserver
 */
package e_observer.연습1;

public class ControlRoomDisplay implements Observer {
    private ElevatorController controller;

    public ControlRoomDisplay(ElevatorController controller) {
        this.controller = controller;
    }

    @Override
    public void update() {
        int curFloor = controller.getFloor();
        System.out.println("ControlRoomDisplay" + curFloor);
    }
}
