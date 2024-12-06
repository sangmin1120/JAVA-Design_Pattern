/*
파일 : Main.java
생성 : 2024-11-17
내용 : rc 호출해 client 호출
 */
package command.연습1;

public class Main {
    public static void main(String[] args) {
        // tv 생성
        TV tv = new TV();
        // command 이용해 controller 생성 1 = Power , 2 = Mute
        TwoButtonController controller = new TwoButtonController(new PowerCommand(tv),new MuteCommand(tv));

        // 버튼 호출
        controller.button1Pressed();
        controller.button2Pressed();
        controller.button1Pressed();
        controller.button1Pressed();
        controller.button2Pressed();
        controller.button1Pressed();
    }
}
