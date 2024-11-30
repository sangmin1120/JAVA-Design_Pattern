/*
파일 : Battery.java
생성 : 2024-11-29
내용 : concrete subject , 변경 관리 대상이 되는 데이터가 있는 클래스
 */
package observer.연습2;

public class Battery extends Subject {
    private int level = 100;

    public void consume(int amount){
        level -= amount;
        notifyObservers();
    }

    public int getLevel() {
        return level;
    }
}
