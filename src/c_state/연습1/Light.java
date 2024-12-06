/*
파일 : light.java
생성 : 2024-11-14
내용 : 실제 state 객체
 */
package c_state.연습1;

public class Light {
    private State state;

    public Light() {
        state = OFF.getInstance();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void on_button_push(){
        state.on_button_push(this);
    }

    public void off_button_push(){
        state.off_button_push(this);
    }
}
