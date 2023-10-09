package exe;



public class Memory implements Component
 {
    public double getPrice()
    {
        return 0;
    }

    public boolean validateConfiguration()
    {
        return false;
    }

    public void accept(IVisitor v)
    {
        v.ForMemory(this);
    }
 }
