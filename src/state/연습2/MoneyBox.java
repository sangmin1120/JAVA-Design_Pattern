/*
파일 : MoneyBox.java
생성 : 2024-11-4
내용 : 돈 관리하는 객체
 */
package state.연습2;

public class MoneyBox {
    private int money;

    public int getMoney(){
        return money;
    }

    public void insert(int money){
        this.money += money;
    }
    public void dispense(int price){
        this.money -= price;
    }
    public int returnMoney(){
        int tmp = this.money;
        this.money = 0;
        return tmp;
    }
}
