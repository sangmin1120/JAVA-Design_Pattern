/*
파일 : Main.java
생성 : 2024-11-14
내용 : vendingMachine 호출해 동작
 */
package c_state.연습2;

public class Main {
    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine(5,1000);

        machine.insertMoney(1000);
        machine.insertMoney(500);
        machine.pushButton();
        machine.returnMoney();
        machine.insertMoney(1000);
        machine.insertMoney(1000);
        machine.pushButton();         
    }
}
