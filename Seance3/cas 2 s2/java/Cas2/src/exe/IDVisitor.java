package exe;



public class IDVisitor implements IVisitor
{
    public void ForMemory(Memory c)
    {
        System.out.println("I'm some Memory !");
    }
    public void ForCPU(CPU c)
    {
        System.out.println("I'm some CPU !");
    }

}