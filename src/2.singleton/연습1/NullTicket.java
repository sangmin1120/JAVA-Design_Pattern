/*
파일 : NullTicket.java
생성 : 2024-11-13
내용 : 티켓 발행 실패(null) 객체 발행
 */
package singleton.연습1;

public class NullTicket implements Ticket{

    @Override
    public int getTicketNum() {
        return 0;
    }
}
