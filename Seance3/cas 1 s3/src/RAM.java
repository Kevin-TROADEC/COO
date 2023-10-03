public class RAM extends ConcreteComponent{
    protected int memoryMB;

    RAM(String name, double price, int memory) {
        super(name, price);
        this.memoryMB = memory;
    }

    public int getRAM() {
        return memoryMB;
    }
}
