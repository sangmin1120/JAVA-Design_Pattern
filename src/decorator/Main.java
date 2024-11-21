/*
파일 : Main.java
생성 : 2024-11-21
내용 : Main 실행 , args 입력받아야 함
 */
package decorator;

public class Main {
    public static void main(String[] args) {
        CarComponent car = new BasicCar(10000);

        for (String decoratorName:args){
            if (decoratorName.equalsIgnoreCase("AirBag"))
                car = new AirBagDecorator(car,100);
            if (decoratorName.equalsIgnoreCase("ESC"))
                car = new ESCDecorator(car,50);
            if (decoratorName.equalsIgnoreCase("Navi"))
                car = new NaviDecorator(car,30);
            if (decoratorName.equalsIgnoreCase("SCC"))
                car = new SCCDecorator(car,70);
        }

        System.out.println(car.getPrice());
        System.out.println(car.getCarinfo());
    }
}
