/*
파일 : User.java
생성 : 2024-11-11
내용 : 이름,누적금액 => User 객체
      buyBook 책을 산다.
 */
package a_strategy.strategy.연습;

public class User {
    private String name;
    private int total;

    public User(String name) {
        this.name = name;
        total = 0;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }

    public void buyBook(int price){
        total += price;
        System.out.println("구매: " + price);
        System.out.println("누적 금액: " + total);
    }
}
