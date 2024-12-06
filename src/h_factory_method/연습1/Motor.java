package h_factory_method.연습1;

public abstract class Motor {
    private MotorStatus motorStatus;

    public Motor() {
        this.motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING)
            return;

        moveMotor(direction);
        setMotorStatus(MotorStatus.STOPPED);
    }

    public void stop(){
        motorStatus = MotorStatus.STOPPED;
    }
    protected abstract void moveMotor(Direction direction);
}
