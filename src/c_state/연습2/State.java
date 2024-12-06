/*
파일 : state.java
생성 : 2024-11-14
내용 : 자판기의 동작 인터페이스
 */
package c_state.연습2;

public interface State {
    public void insertCoin(int money); // 돈 투입
    public void pushButton(int price); // 버튼 누름
    public void returnCoin(); // 거스름돈 반환
}
