/*
파일 : SCCDecorator.java
생성 : 2024-11-21
내용 : option decorator
 */
package decorator;

public class SCCDecorator extends CarOptionDecorator{
    private int sccPrice;

    public SCCDecorator(CarComponent component,int sccPrice) {
        super(component);
        this.sccPrice = sccPrice;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + sccPrice;
    }

    @Override
    public String getCarinfo() {
        return super.getCarinfo() + "with SCC";
    }
}
