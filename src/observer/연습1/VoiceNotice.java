/*
파일 : VoiceNotice.java
생성 : 2024-11-18
내용 : ConcreteObserver , 보이스로 안내
 */
package observer.연습1;

public class VoiceNotice implements Observer {
    private ElevatorController controller;

    public VoiceNotice(ElevatorController controller) {
        this.controller = controller;
    }

    @Override
    public void update() {
        int curFloor = controller.getFloor();
        System.out.println("Voice Notice = " + curFloor);
    }
}
