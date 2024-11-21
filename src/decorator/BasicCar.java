/*
파일 : BasicCar.java
생성 : 20024-11-21
내용 : CarComponent 상속 받는 기본 출력 객체
 */
package decorator;

public class BasicCar extends CarComponent{
    private int price;

    public BasicCar(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getCarinfo() {
        return "BasicCar";
    }
}
