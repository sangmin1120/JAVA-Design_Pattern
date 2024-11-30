/*
파일 : CarOptionDecorator.java
생성 : 2024-11-21
내용 : decorator , option 부모 객체
 */
package decorator;

public class CarOptionDecorator extends CarComponent{
    private CarComponent component;

    public CarOptionDecorator(CarComponent component) {
        this.component = component;
    }

    @Override
    public int getPrice() {
        return component.getPrice();
    }

    @Override
    public String getCarinfo() {
        return component.getCarinfo();
    }
}
