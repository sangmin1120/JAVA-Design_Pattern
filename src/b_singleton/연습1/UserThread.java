/*
파일 : UserThread.java
생성 : 2024-11-13
내용 : User 의 ticket 발행하고 저장하는 객체
 */
package b_singleton.연습1;

public class UserThread extends Thread{
    private Ticket myticket;

    public UserThread(String name) {
        super(name);
    }

    public void run(){
        TicketManager tmg = TicketManager.getInstance();
        myticket = tmg.getTicket(); // 티켓 발행
    }

    public Ticket getMyTicket(){
        return myticket;
    }
}
