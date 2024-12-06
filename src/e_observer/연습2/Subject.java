/*
파일 : Subject.java
생성 : 2024-11-29
내용 ; ConcreteObserver 객체를 관리하는 요소
 */
package e_observer.연습2;

import java.util.ArrayList;

public abstract class Subject {
    private ArrayList<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
