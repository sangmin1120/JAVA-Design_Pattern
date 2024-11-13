/*
파일 : NormalTicket.java
생성 : 2024-11-13
내용 : 정상적으로 생성된 티켓
 */
package singleton.연습1;

public class NormalTicket implements Ticket{
    private int serial_num;

    public NormalTicket(int serial_num) {
        this.serial_num = serial_num;
    }

    @Override
    public int getTicketNum() {
        return serial_num;
    }
}
