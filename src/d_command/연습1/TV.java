/*
파일 : TV.java
생성 : 2024-11-17
내용 : 실제 TV 실행 객체 (receiver)
 */
package d_command.연습1;

public class TV {
    private boolean powerOn = false;
    private boolean muteOn = false;

    public void power(){
        powerOn = !powerOn;

        if (powerOn){
            System.out.println("Power On");
        }
        else{
            System.out.println("Power Off");
        }
    }

    public void mute(){
        if (!powerOn)
            return;

        muteOn = !muteOn;

        if (muteOn){
            System.out.println("Mute On");
        }
        else{
            System.out.println("Mute Off");
        }
    }
}
