/*
파일 : Drinking.java
생성 : 2024-11-14
내용 : 음료의 가격과 재고 관리하는 객체
 */
package c_state.연습2;

public class Drinking {
    private int stock;
    private int price;

    public Drinking(int stock, int price) {
        this.stock = stock;
        this.price = price;
    }

    public void dispense(){
        stock--;
    }
    public int getPrice() {
        return price;
    }
    public int getStock(){
        return stock;
    }
}
