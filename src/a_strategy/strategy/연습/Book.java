/*
파일 : Book.java
생성 : 2024-11-11
내용 : 이름,출판년도,가격,할인 정책 => Book , setPricePolicy 핵심
 */
package a_strategy.strategy.연습;

public class Book {
    private DiscountPolicy pricePolicy;
    private String title;
    private String publishYear;
    private int price;

    public Book(String title, String publishYear , int price) {
        this.title = title;
        this.publishYear = publishYear;
        this.price = price;
    }

    void setPricePolicy(DiscountPolicy pricePolicy) {
        this.pricePolicy = pricePolicy;
    }

    int getPrice() {
        return price;
    }

    int getDiscountPrice() {
       return pricePolicy.getDiscountPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public String getPublishYear() {
        return publishYear;
    }
}
