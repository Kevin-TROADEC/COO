package exe;


public class UseVisitor implements IVisitor
{
    public void ForMemory(Memory c)
    {
        System.out.println("I'm extracting data from this memory");
    }
    public void ForCPU(CPU c)
    {
        System.out.println("I'm a doing some operation with this CPU");
    }

}