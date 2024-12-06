/*
파일 : ElevatorController.java
생성 : 2024-11-18
내용 : 변경 관리 대상이 되는 데이터가 있는 클래스
 */
package observer.연습1;

import java.util.Observable;

public class ElevatorController extends Subject {
    int curFloor = 1;

    public void gotoFloor(int destination){
        curFloor = destination;
        notifyObservers(); // observer에게 통보
    }

    public int getFloor(){
        return curFloor;
    }
}
