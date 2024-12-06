/*
파일 : TwoButtonController.java
생성 : 2024-11-17
내용 : invoke 되는 객체
 */
package d_command.연습1;

public class TwoButtonController {
    private Command command1;
    private Command command2;

    public TwoButtonController(Command command1, Command command2) {
        this.command1 = command1;
        this.command2 = command2;
    }

    public void button1Pressed(){
        command1.excute();
    }

    public void button2Pressed(){
        command2.excute();
    }
}
