package h_factory_method.연습1;

public class LGMotor extends Motor{
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move LG Motor " + direction);
    }
}
