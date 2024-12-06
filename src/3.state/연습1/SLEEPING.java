/*
파일 : SLEEPING.java
생성 : 2024-11-14
내용 : SLEEPING 상태 버튼 동작 -> 싱글톤 구현
 */
package state.연습1;

public class SLEEPING implements State {
    private static SLEEPING sleeping = new SLEEPING();

    private SLEEPING() {} // singleton

    public static SLEEPING getInstance() {
        return sleeping;
    }

    @Override
    public void on_button_push(Light light) {
        light.setState(ON.getInstance());
        System.out.println("ON : 불 켜짐");
    }

    @Override
    public void off_button_push(Light light) {
        light.setState(OFF.getInstance());
        System.out.println("OFF : 불 꺼짐");
    }
}
