/*
파일 : MuteCommand.java
생성 : 2024-11-17
내용 : Mute concrete_command
 */
package d_command.연습1;

public class MuteCommand implements Command {
    private TV tv;
    public MuteCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void excute() {
        tv.mute();
    }
}
