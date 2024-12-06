/*
파일 : OFF.java
생성 : 2024-11-14
내용 : OFF 상태에서 동작 정의 => 싱글톤 구현
 */
package state.연습1;

public class OFF implements State{
    private static OFF off = new OFF();

    private OFF(){} // singleton

    public static OFF getInstance(){
        return off;
    }
    @Override
    public void on_button_push(Light light) {
        light.setState(ON.getInstance());
        System.out.println("ON : 불이 켜짐");
    }

    @Override
    public void off_button_push(Light light) {
        System.out.println("OFF : 반응 없음");
    }
}
