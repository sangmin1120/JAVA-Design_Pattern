/*
파일 : Main.java
생성 : 2024-11-13
내용 : user -> ticket 발행 (키오스키)
 */
package singleton.연습1;

public class Main {
    private static final int THREAD_NUM = 15;
    public static void main(String[] args) {
        TicketManager mgr = TicketManager.getInstance();
        mgr.setLimit(5); // 발행할 수 있는 티켓 제한

        UserThread[] users = new UserThread[THREAD_NUM]; // 티켓 요구 THREAD_NUM 만큼

        for (int i = 0; i < THREAD_NUM; i++) {
            users[i] = new UserThread((i+1)+"-thread");
            users[i].start();
        }

        for (int i=0;i<THREAD_NUM;i++){
            try{
                users[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i=0;i<THREAD_NUM;i++){
            if (users[i].getMyTicket().getTicketNum() != 0){
                System.out.println("User" + i + "-th Thread get ticket" + users[i].getMyTicket().getTicketNum());
            }
        }
    }
}
