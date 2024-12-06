/*
파일 : State.java
생성 : 2024-11-14
내용 : 각 state 동작을 interface
 */
package c_state.연습1;

public interface State {
    public void on_button_push(Light light);
    public void off_button_push(Light light);
}
