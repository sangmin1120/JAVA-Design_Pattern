package h_factory_method.연습1;

public class MotorFactory {

    static Motor getInstance(MotorVendor motorVendor){
        Motor motor = null;

        switch(motorVendor){
            case LGMotor:
                motor = new LGMotor();
                break;
            case HyundaiMotor:
                motor = new HyundaiMotor();
                break;
        }
        return motor;
    }
}
