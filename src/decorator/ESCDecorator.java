/*
파일 : ESCDecorator.java
생성 : 2024-11-21
내용 : option decorator
 */
package decorator;

public class ESCDecorator extends CarOptionDecorator{
    private int escPrice;

    public ESCDecorator(CarComponent component,int escPrice) {
        super(component);
        this.escPrice = escPrice;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + escPrice;
    }

    @Override
    public String getCarinfo() {
        return super.getCarinfo() + "with ESC";
    }
}
