package h_factory_method.연습1;

public class HyundaiMotor extends Motor{
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move Hyundai Motor " + direction);
    }
}
