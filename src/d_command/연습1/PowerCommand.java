/*
파일 : PowerCommand.java
생성 : 2024-11-17
내용 : PowerOn concrete_command
 */
package d_command.연습1;

public class PowerCommand implements Command {
    private TV tv;
    public PowerCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void excute() {
        tv.power();
    }
}
