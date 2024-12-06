/*
파일 : TicketManager.java
생성 : 2024-11-13
내용 : 티켓 발행 객체 singleton
 */
package b_singleton.연습1;

public class TicketManager {
    private static TicketManager instance;
    private int limits; // 티켓 최대 수
    private int count; // 현재 발행된 티켓 수

    private TicketManager() {}

    public static synchronized TicketManager getInstance() {
        if (instance == null) {
            instance = new TicketManager();
        }
        return instance;
    }

    public synchronized void setLimit(int limits) {
        this.limits = limits;
    }

    public synchronized Ticket getTicket(){
        if (count < limits)
            return new NormalTicket(++this.count);
        return new NullTicket();
    }
}
