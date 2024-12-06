/*
파일 : SoldOutState.java
생성 : 2024-11-14
내용 : state 구현체 -> 재고없는 state
 */
package c_state.연습2;

public class SoldOutState implements State{
    private VendingMachine machine;

    public SoldOutState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin(int money) {
        System.out.println("SoldOut : 재고 없음");
    }

    @Override
    public void pushButton(int price) {
        System.out.println("SoldOut : 재고 없음");
    }

    @Override
    public void returnCoin() {
        int cnt = machine.getMoneyBox().getMoney();
        System.out.println("SoldOut : " + cnt + " 원 반환");
        machine.setState(machine.getNoMoneyState());
    }
}
