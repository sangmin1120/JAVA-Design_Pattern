/*
파일 : Main.java
생성 : 2024-11-18
내용 : Client
 */
package e_observer.연습1;

public class Main {
    public static void main(String[] args) {
        ElevatorController controller = new ElevatorController();

        // Observer
        Observer elevatorDisplay = new ElevatorDisplay(controller);
        Observer floorDisplay = new ElevatorDisplay(controller);
        Observer voiceDisplay = new ElevatorDisplay(controller);
        Observer controlRoomDisplay = new ElevatorDisplay(controller);

        // observer 추가
        controller.attach(elevatorDisplay);
        controller.attach(floorDisplay);
        controller.attach(voiceDisplay);
        controller.attach(controlRoomDisplay);

        // update
        controller.gotoFloor(5);

        // observer 삭제
        controller.detach(elevatorDisplay);
        controller.gotoFloor(100);
        
    }
}
