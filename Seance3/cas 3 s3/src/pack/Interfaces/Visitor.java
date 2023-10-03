package pack.Interfaces;
import pack.Moins;
import pack.Nombre;
import pack.Plus;

public interface Visitor {
    public int visit(Plus p);
    public int visit(Moins m);
    public int visit(Nombre n);
}
