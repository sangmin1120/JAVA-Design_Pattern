/*
파일 : strategy.java
생성 : 2024-11-11
내용 : strategy pattern 확인
 */
package a_strategy.strategy.연습;

public class strategy {
    public static void main(String[] args) {
        User user1 = new User("first");
        User user2 = new User("second");

        Book book1 = new Book("hi","1999",34000);
        Book book2 = new Book("good morning", "20000", 50000);
        Book book3 = new Book("hello world", "1893", 30000);

        book1.setPricePolicy(new PercentDiscountPolicy());
        book2.setPricePolicy(new PercentDiscountPolicy());

        user1.buyBook(book1.getDiscountPrice());
        user1.buyBook(book2.getDiscountPrice());
    }
}
