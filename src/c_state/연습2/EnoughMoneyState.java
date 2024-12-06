/*
파일 : EnoughMoneyState.java
생성 : 2024-11-14
내용 : state 구현체 -> 돈이 충분히 있는 state
 */
package c_state.연습2;

public class EnoughMoneyState implements State{
    private VendingMachine machine;

    public EnoughMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin(int money) {
        machine.getMoneyBox().insert(money);
        System.out.println("Enough : " + money +" 원 투입" + " 현재 : " + machine.getMoneyBox().getMoney());
    }

    @Override
    public void pushButton(int price) {
        machine.getMoneyBox().dispense(price);
        machine.getDrinking().dispense();

        System.out.println("Enough : " + price + " 원 구입");

        if (machine.getDrinking().getStock()<=0) // 재고 없음
            machine.setState(machine.getSoldOutState());
        else if (machine.getMoneyBox().getMoney() == 0) // 돈 없음
            machine.setState(machine.getNoEnoughMoneyState());
        else if (machine.getMoneyBox().getMoney()<machine.getDrinking().getPrice()) // 돈 부족
            machine.setState(machine.getNoEnoughMoneyState());
    }

    @Override
    public void returnCoin() {
        int cnt = machine.getMoneyBox().returnMoney();
        System.out.println("Enough : " + cnt + " 원 반환");
        machine.setState(machine.getNoMoneyState());
    }
}
