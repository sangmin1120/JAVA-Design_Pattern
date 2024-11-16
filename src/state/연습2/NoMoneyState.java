/*
파일 : NoMoneyState.java
생성 : 2024-11-14
내용 : State 구현체 -> 돈이 없는 state
 */
package state.연습2;

public class NoMoneyState implements State{
    private VendingMachine machine;

    public NoMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin(int money) {
        machine.getMoneyBox().insert(money);
        System.out.println("NoMoney : " +money + " 원 넣음");

        // 돈이 충분한가를 판단
        if (money >= machine.getDrinking().getPrice())
            machine.setState(machine.getEnoughMoneyState());
        else
            machine.setState(machine.getNoEnoughMoneyState());
    }

    @Override
    public void pushButton(int price) {
        System.out.println("NoMoney : 돈이 없습니다.");
    }

    @Override
    public void returnCoin() {
        System.out.println("NoMoney : 반환할 돈이 없습니다.");
    }
}
