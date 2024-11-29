/*
파일 : AirBagDecorator.java
생성 : 2024-11-21
내용 : option decorator
 */
package decorator;

public class AirBagDecorator extends CarOptionDecorator{
    private int airBagPrice;

    public AirBagDecorator(CarComponent carComponent,int airBagPrice) {
        super(carComponent);
        this.airBagPrice = airBagPrice;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + airBagPrice;
    }

    @Override
    public String getCarinfo() {
        return super.getCarinfo() + " with Air Bag";
    }
}
