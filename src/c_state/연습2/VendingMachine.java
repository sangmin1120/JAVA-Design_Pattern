/*
파일 : VendingMachine.java
생성 : 2024-11-14
내용 : 실제 자판기라고 생각하면 됨.
 */
package c_state.연습2;

public class VendingMachine {
    private State noMoneyState;
    private State noEnoughMoneyState;
    private State enoughMoneyState;
    private State soldOutState;

    private State state;

    private MoneyBox moneyBox;
    private Drinking drinking;

    public VendingMachine(int stock,int price) {
        // 상태 객체 생성
        this.noMoneyState = new NoMoneyState(this);
        this.noEnoughMoneyState = new NoEnoughMoneyState(this);
        this.enoughMoneyState = new EnoughMoneyState(this);
        this.soldOutState = new SoldOutState(this);

        moneyBox = new MoneyBox();
        drinking = new Drinking(stock,price);

        if (drinking.getStock()>0)
                state = noMoneyState; // 재고 있으므로 noMoney 상태
        else
                state = soldOutState; // 재고 없으므로 soldOut 상태
    }

    public void setState(State state){
        this.state = state;
    }

    // 자판기 동작
    public void insertMoney(int money){
        state.insertCoin(money);
    }
    public void pushButton(){
        int price = drinking.getPrice();
        state.pushButton(price);
    }
    public void returnMoney(){
        state.returnCoin();
    }

    // moneybox , drinking
    public MoneyBox getMoneyBox(){
        return moneyBox;
    }
    public Drinking getDrinking(){
        return drinking;
    }

    // state instance 관련
    public State getNoMoneyState(){
        return noMoneyState;
    }
    public State getNoEnoughMoneyState() {
        return noEnoughMoneyState;
    }
    public State getEnoughMoneyState() {
        return enoughMoneyState;
    }
    public State getSoldOutState() {
        return soldOutState;
    }

}
