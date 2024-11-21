/*
파일 : NaviDecorator.java
생성 : 2024-11-21
내용 : option decorator
 */
package decorator;

public class NaviDecorator extends CarOptionDecorator{
    private int naviPrice;


    public NaviDecorator(CarComponent component,int naviPrice) {
        super(component);
        this.naviPrice  = naviPrice;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + naviPrice;
    }

    @Override
    public String getCarinfo() {
        return super.getCarinfo() + "with NAVI";
    }
}
