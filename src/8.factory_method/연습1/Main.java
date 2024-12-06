package factory_method.연습1;

public class Main {
    public static void main(String[] args) {
        Motor lgMotor = MotorFactory.getInstance(MotorVendor.LGMotor);
        ElevatorController controller1 = new ElevatorController(1,lgMotor);
        controller1.gotoFloor(5);
        controller1.gotoFloor(3);

        Motor HyundaiMotor = MotorFactory.getInstance(MotorVendor.HyundaiMotor);
        ElevatorController controller2 = new ElevatorController(2,HyundaiMotor);
        controller2.gotoFloor(4);
        controller2.gotoFloor(6);
    }
}
