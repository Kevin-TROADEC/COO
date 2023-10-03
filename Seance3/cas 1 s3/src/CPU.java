public class CPU extends ConcreteComponent{
    protected int clockSpeedMHz;

    CPU(String name, double price, int clockSpeed) {
        super(name, price);
        this.clockSpeedMHz = clockSpeed;
    }

    public int getClockSpeed() {
        return clockSpeedMHz;
    }


}
