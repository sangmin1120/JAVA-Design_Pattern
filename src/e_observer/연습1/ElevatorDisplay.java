/*
파일 : ElevatorDisplay.java
생성 : 2024-11-18
내용 : ConcreteObserver , display
 */
package e_observer.연습1;

public class ElevatorDisplay implements Observer {
    private ElevatorController controller;

    public ElevatorDisplay(ElevatorController controller) {
        this.controller = controller;
    }

    @Override
    public void update() {
        int curFloor = controller.getFloor();
        System.out.println("Elevator Display = " + curFloor);
    }
}
