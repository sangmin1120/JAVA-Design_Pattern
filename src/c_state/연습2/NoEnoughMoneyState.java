/*
파일 : NoEnoughMoneyState.java
생성 : 2024-11-14
내용 : state 구현체 -> 돈이 부족한 state
 */
package c_state.연습2;

public class NoEnoughMoneyState implements State{
    private VendingMachine machine;

    public NoEnoughMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin(int money) {
        machine.getMoneyBox().insert(money);
        System.out.println("NoEnough : " + money + " 원 투입");

        if (machine.getMoneyBox().getMoney() >=machine.getDrinking().getPrice())
            machine.setState(machine.getEnoughMoneyState());
    }

    @Override
    public void pushButton(int price) {
        System.out.println("NoEnough : 돈이 부족합니다.");
    }

    @Override
    public void returnCoin() {
        int cnt = machine.getMoneyBox().returnMoney();
        System.out.println("NoEnough : " + cnt + "원이 반환됩니다.");
        machine.setState(machine.getNoMoneyState());
    }
}
