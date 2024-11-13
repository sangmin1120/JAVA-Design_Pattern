package state.연습1;

public class Main {
    public static void main(String[] args) {
        // 1. light 객체 생성
        Light light = new Light();

        // 2. 동작 확인 (off -> off)
        light.off_button_push();

        // 3. 동작 확인 (off -> on)
        light.on_button_push();

        // 4. 동작 확인 (on -> on)
        light.on_button_push();

        // 5. 동작 확인 (on -> off)
        light.off_button_push();
    }
}
