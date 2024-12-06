/*
파일 : FixDiscountPolicy.java
생성 : 2024-11-11
내용 : strategy 구현체 , fix 만큼 고정 할인
 */
package a_strategy.strategy.연습;

public class FixDiscountPolicy implements DiscountPolicy{
    private int fix = 3000;
    @Override
    public int getDiscountPrice(int price) {
        return price-fix;
    }
}
