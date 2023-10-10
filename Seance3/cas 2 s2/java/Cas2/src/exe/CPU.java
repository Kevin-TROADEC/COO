package exe;



public class CPU implements Component 
{
    public double getPrice()
    {
        return 0;
    }

    public boolean validateConfiguration()
    {
        return false;
    }
    
    @Override
    public void accept(IVisitor v)
    {
        v.ForCPU(this);
    }
}