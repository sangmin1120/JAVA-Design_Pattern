/*
파일 : PercentDiscountPolicy.java
생성 : 2024-11-11
내용 : strategy 구현체 , percent 할인
 */
package a_strategy.strategy.연습;

public class PercentDiscountPolicy implements DiscountPolicy {
    private int percent = 10;
    @Override
    public int getDiscountPrice(int price) {
        return (int)((100-percent)/100.0*price);
    }
}
