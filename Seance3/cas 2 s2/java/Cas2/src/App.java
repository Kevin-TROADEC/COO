
import exe.CPU;
import exe.IDVisitor;
import exe.IVisitor;
import exe.Memory;
import exe.UseVisitor;
public class App {
    public static void main(String[] args)  {
        Memory RAM = new Memory();
        CPU cpu = new CPU();
        
        IVisitor callSelf = new IDVisitor();
        IVisitor useSelf = new UseVisitor();
 
        RAM.accept(callSelf);
        cpu.accept(callSelf);
 
        RAM.accept(useSelf);
        cpu.accept(useSelf);
    }
}
