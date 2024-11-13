/*
파일 : ON.java
생성 : 2024-11-14
내용 : ON 상태에서 동작 정의 => 싱글톤으로 구현
 */
package state.연습1;

public class ON implements State{
    private static ON on = new ON();

    private ON(){} // singleton

    public static ON getInstance(){
        return on;
    }

    @Override
    public void on_button_push(Light light) {
        light.setState(SLEEPING.getInstance());
        System.out.println("SLEEPING : 취침등");
    }

    @Override
    public void off_button_push(Light light) {
        light.setState(OFF.getInstance());
        System.out.println("OFF : 불 꺼짐");
    }
}
