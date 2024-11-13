/*
파일 : Main.java
생성 : 2024-11-14
내용 : light 객체를 호출해 상태 변환 확인
 */
package state.연습1;

public class Main {
    public static void main(String[] args) {
        // 1. light 객체 생성
        Light light = new Light();

        // 2. 동작 확인 (off -> off)
        light.off_button_push();

        // 3. 동작 확인 (off -> on)
        light.on_button_push();

        // 4. 동작 확인 (on -> sleeping)
        light.on_button_push();

        // 5. 동작 확인 (sleeping -> on)
        light.on_button_push();

        // 6. 동작 확인 (on -> sleeping -> off)
        light.on_button_push();
        light.off_button_push();
    }
}
